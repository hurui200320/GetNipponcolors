package info.skyblond.getNipponcolors;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ColorGetter {
    public static void readToFile() throws IOException, InterruptedException {
        Thread nipponColors = new Thread(new NipponColorsGetter());
        nipponColors.start();

        Thread colordic = new Thread(new ColordicGetter());
        colordic.start();

        Thread irocore = new Thread(new IrocoreGetter());
        irocore.start();

        nipponColors.join();
        colordic.join();
        irocore.join();

        System.out.println("Everything is done.");
    }




}

class NipponColorsGetter implements Runnable{
    static NipponColorsGetter nipponColorsGetter = new NipponColorsGetter();
    NipponColorsGetter(){}
    public static NipponColorsGetter getter(){
        return nipponColorsGetter;
    }

    @Override
    public void run() {
        try {
            String rawSite = HttpRequest.sendGet("http://nipponcolors.com","");
            if(Thread.currentThread().isInterrupted())
                return;
            String rawColors = rawSite.split("<ul id=\"colors\">")[1].split("</ul>")[0];
            String[] colors = rawColors.split("</a></div></li>");

            ArrayList<Color> colorArrayList = new ArrayList<Color>();

            for(String rawcolor : colors){
                rawcolor = rawcolor.trim();
                if(rawcolor.equals(""))
                    continue;
                String colorInfo = rawcolor.split(">")[3];
                colorArrayList.add(new Color(colorInfo.split(", ")[0],colorInfo.split(", ")[1]));
                //System.out.println(colorInfo);
            }

            for(Color color : colorArrayList){
                String respond = HttpRequest.sendPost("http://nipponcolors.com/php/io.php","color=" + color.roma.toUpperCase());
                if(Thread.currentThread().isInterrupted())
                    return;
                String[] colorJson = respond.substring(1).split(",");
                String index,cmyk,rgb;
                index = colorJson[0].split("\":\"")[1];
                cmyk = colorJson[1].split("\":\"")[1];
                rgb = colorJson[2].split("\":\"")[1];
                index = index.substring(0,index.length()-1).trim();
                cmyk = cmyk.substring(0,cmyk.length()-1).trim();
                rgb = rgb.substring(0,rgb.length()-2).trim();

                //System.out.println(rgb.substring(0,2));

                color.setProperties(index,cmyk,rgb);
                //System.out.println(color);//human understandable form
                System.out.println(color);
            }

            //System.out.println(colorArrayList.size());

            //output Result to file as json format
            Path path1 = Paths.get("./nipponcolors.com.json");
            BufferedWriter writer1 = Files.newBufferedWriter(path1, Charset.forName("utf-8"));
            if(Thread.currentThread().isInterrupted())
                return;
            for(Color color: colorArrayList){
                writer1.write(new Gson().toJson(color));
                writer1.newLine();
                if(Thread.currentThread().isInterrupted())
                    return;
            }
            writer1.close();
            if(Thread.currentThread().isInterrupted())
                return;
        } catch (IOException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }finally {
            System.out.println("NipponColors Done.");
        }
    }
}

class ColordicGetter implements Runnable{

    @Override
    public void run() {
        try {
            //Another website
            String rawSite2 = HttpRequest.sendGet("https://www.colordic.org/w/", "");
            if(Thread.currentThread().isInterrupted())
                return;
            String rawColors2 = rawSite2.split("<table class=\"colortable\">")[1].split("</table>")[0];
            String[] colors2 = rawColors2.split("<td style=\"background-color:");

            ArrayList<Color> colorArrayList2 = new ArrayList<Color>();

            for (String s : colors2) {
                if (!s.trim().startsWith("#"))
                    continue;
                String[] colorInfo = s.split(">");
                //for(String c : colorInfo)
                //    System.out.println(c);
                String name, ramo, rgb;
                Color color = new Color(colorInfo[2].substring(0, colorInfo[2].length() - 5), colorInfo[3].substring(0, colorInfo[3].length() - 6));
                color.rgb = colorInfo[0].substring(1, 7).trim().toUpperCase();
                color.url = colorInfo[1].split("\"")[3];
                //System.out.println(color.url);
                //System.out.println(color);
                colorArrayList2.add(color);
                //System.out.println(color);
            }
            //Get CMYK
            for (Color color : colorArrayList2) {
                String raw = HttpRequest.sendGet(color.url, "");
                if(Thread.currentThread().isInterrupted())
                    return;
                String rawCmyk = raw.split("<div class=\"detail\">")[1].split("</div>")[0];
                String[] cmyks = rawCmyk.split("<h2>");
                String cmyk = "";
                Col:
                for (String s : cmyks) {
                    if (!s.trim().startsWith("C:"))
                        continue;
                    s = s.split("<span")[0];
                    for (String c : s.split("%")) {
                        try {
                            int m = Integer.parseInt(c.trim().split(":")[1]);
                            cmyk = cmyk + new Tools().formatCMYK(m);
                        } catch (Exception e) {
                            cmyk = "------------";
                            break Col;
                        }
                    }
                }
                color.cmyk = cmyk;
                System.out.println(color);
            }

            Path path2 = Paths.get("./www.colordic.org.json");
            BufferedWriter writer2 = Files.newBufferedWriter(path2, Charset.forName("utf-8"));
            if(Thread.currentThread().isInterrupted())
                return;
            for (Color color : colorArrayList2) {
                writer2.write(new Gson().toJson(color));
                if(Thread.currentThread().isInterrupted())
                    return;
                writer2.newLine();
            }
            writer2.close();
            if(Thread.currentThread().isInterrupted())
                return;
        }catch (IOException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }finally {
            System.out.println("colorDic Done.");
        }
    }
}

class IrocoreGetter implements Runnable{

    @Override
    public void run(){
        try {
            //The Third
            String rawSite3 = HttpRequest.sendGet("https://irocore.com", "");
            if (Thread.currentThread().isInterrupted())
                return;
            String rawColors3 = rawSite3.split("和名五十音順一覧")[1].split("<!-- irocore-記事下レスポンシブ -->")[0];
            String[] colors3 = rawColors3.split("<a href=\"");
            ArrayList<Color> colorArrayList3 = new ArrayList<Color>();
            for (String s : colors3) {
                if (!s.trim().startsWith("https://"))
                    continue;
                String[] colorInfo = s.split(">");
            /*for(String c:colorInfo)
                System.out.println(c);*/
                String name, ramo, rgb;
                Color color = new Color(colorInfo[1].substring(0, colorInfo[1].length() - 5), colorInfo[2].substring(0, colorInfo[2].length() - 6));
                color.rgb = colorInfo[0].split("style=\"background:#")[1].split(";")[0];
                //System.out.println(s);
                color.url = colorInfo[0].split("\"")[0];
                colorArrayList3.add(color);
                //System.out.println(color.url);
            }
            //get CMYK value
            for (Color color : colorArrayList3) {
                String raw = HttpRequest.sendGet(color.url, "");
                if (Thread.currentThread().isInterrupted())
                    return;
                String rawCmyk = raw.split("<td class=\"cmyk\">")[1].split("</td>")[0];
                String[] cmyks = rawCmyk.split("</span>");
                String cmyk = "";
                for (String s : cmyks) {
                    //System.out.println(color.url + "\n" + s);
                    try {
                        int c = Integer.parseInt(s.split("<")[0].substring(3, 5).trim());
                        cmyk = cmyk + new Tools().formatCMYK(c);
                    } catch (Exception e) {
                        cmyk = "------------";
                        break;
                    }
                }
                color.cmyk = cmyk;
                //System.out.println(color);
            }

            Path path3 = Paths.get("./irocore.com.json");
            BufferedWriter writer3 = Files.newBufferedWriter(path3, Charset.forName("utf-8"));
            if (Thread.currentThread().isInterrupted())
                return;
            for (Color color : colorArrayList3) {
                if (Thread.currentThread().isInterrupted())
                    return;
                writer3.write(new Gson().toJson(color));
                writer3.newLine();
            }
            writer3.close();
            if (Thread.currentThread().isInterrupted())
                return;
        }catch (IOException e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }finally {
            System.out.println("Irocore Done.");
        }
    }

}
