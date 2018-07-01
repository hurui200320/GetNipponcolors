package info.skyblond.getNipponcolors;

import com.google.gson.Gson;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ArrayList<Color> act = new ArrayList<Color>();

        //ColorGetter.readToFile();   //Read colors from 3 different website and write them to file with json
        ArrayList<Color> colors = ColorReader.readFile("./nipponcolors.com.json");//Read one
        //output as markdown table
        //toMarkdownTable(colors,"NipponColors","nipponcolors.com","http://nipponcolors.com/");
        //output SVG(control)
        //toSVG(colors,"NipponColors");
        //output SVG(file)
        //toSVG(colors,"NipponColors","./NipponColors.svg");
        toACT(colors,"./nipponcolors.ACT");
        //act.addAll(takeColors(colors,new int[]{3, 9, 10, 11, 14, 16, 19, 20, 22, 23, 26, 30, 31, 32, 33, 34, 35, 37, 40, 41, 46, 48, 51, 58, 61, 63, 66, 67, 68, 69, 75, 76, 78, 79, 81, 82, 83, 87, 92, 94, 95, 96, 97, 105, 107, 111, 114, 119, 120, 126, 136, 137, 143, 147, 153, 154, 162, 163, 164, 167, 173, 174, 179, 184, 188, 190, 192, 196, 198, 201, 204, 208, 210, 212, 217, 220, 233, 242, 243, 244, 247}));//your number here

        colors.clear();//another one
        colors = ColorReader.readFile("./www.colordic.org.json");
        //toMarkdownTable(colors,"ColorDic","www.colordic.org","https://www.colordic.org/w/");
        //toSVG(colors,"ColorDic","./ColorDic.svg");
        ArrayList<Color> colordic1 = new ArrayList<Color>();
        ArrayList<Color> colordic2 = new ArrayList<Color>();
        int x = 1;
        for(Color c : colors){
            if(x <= 254)
                colordic1.add(c);
            else
                colordic2.add(c);
        }
        toACT(colordic1,"./colordic1.ACT");
        toACT(colordic2,"./colordic2.ACT");
        //act.addAll(takeColors(colors,new int[]{1, 2, 5, 9, 12, 14, 22, 25, 42, 46, 51, 56, 58, 63, 75, 82, 84, 101, 116, 119, 132, 143, 147, 151, 153, 155, 157, 159, 164, 168, 178, 181, 182, 184, 188, 190, 193, 195, 198, 205, 221, 225, 240, 253, 263, 264, 267, 271, 275, 282, 296, 305, 306, 314, 317, 319, 323, 340, 348, 354, 356, 358, 364, 377, 379, 384, 396, 397, 398, 400, 406, 407, 415, 416, 422, 424, 430, 431, 435, 439, 446, 448, 454, 455, 456, 463}));//your number here

        colors.clear();
        colors = ColorReader.readFile("./irocore.com.json");
        //toMarkdownTable(colors,"IroCore","irocore.com","https://irocore.com");
        //toSVG(colors,"IroCore","./IroColor.svg");
        ArrayList<Color> irocore1 = new ArrayList<Color>();
        ArrayList<Color> irocore2 = new ArrayList<Color>();
        x = 1;
        for(Color c : colors){
            if(x <= 254)
                irocore1.add(c);
            else
                irocore2.add(c);
        }
        toACT(irocore1,"./irocore1.ACT");
        toACT(irocore2,"./irocore2.ACT");
        //act.addAll(takeColors(colors,new int[]{3, 9, 11, 26, 29, 31, 32, 39, 40, 41, 42, 47, 52, 54, 57, 73, 83, 91, 94, 95, 96, 111, 115, 120, 121, 123, 140, 142, 146, 156, 159, 160, 167, 168, 172, 175, 177, 184, 187, 192, 200, 201, 208, 217, 226, 228, 231, 245, 255, 256, 258, 263, 266, 268, 272, 275, 280, 282, 287, 288, 293, 297, 300, 312, 313, 317, 323, 328, 333, 335, 339, 343, 359, 361, 365, 367, 370, 373, 374, 386, 392, 400, 406, 408, 410, 438, 439, 450, 453, 456}));//your number here

        //for(Color color : act)
        //    System.out.println(act);
        //toACT(act,"./default.ACT");

    }

    public static void toMarkdownTable(ArrayList<Color> colors, String name, String web, String url){
        System.out.println("## " + name);
        System.out.println("\nColors from [" + web +"](" + url + ") :\n");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|" + String.valueOf(color.index) + ". " + color.name + "|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|");
        System.out.println();
    }

    public static void toSVG(ArrayList<Color> colors, String tittle, String path) throws IOException {
        String textColor = "black";//or white, text color
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(path), Charset.forName("utf-8"));

        writer.write("<?xml version=\"1.0\" standalone=\"no\"?>");
        writer.newLine();
        writer.write("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">");
        writer.newLine();
        writer.newLine();
        writer.write("<svg width=\"100%\" height=\"100%\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">");
        writer.newLine();
        writer.newLine();
        writer.write("<text x=\"650\" y=\"50\" font-size=\"30\" fill=\"" + textColor + "\" style='dominant-baseline:middle;text-anchor:middle;'>" + tittle + "</text>");
        writer.newLine();
        writer.newLine();
        int x = 0, y = 0;
        for(Color color : colors){
            if( x > 4){
                x = 0;y++;
            }
            writer.write("<rect  x=\"" + String.valueOf(50 + x * 250)+  "\" y=\"" + String .valueOf(100 + y * 250)
                    + "\" width=\"200\" height=\"100\" style=\"fill:rgb(" + Integer.parseInt(color.rgb.substring(0,2),16) + "," + Integer.parseInt(color.rgb.substring(2,4),16)
                    + "," + Integer.parseInt(color.rgb.substring(4,6),16) + ");dominant-baseline:middle;text-anchor:middle;\"/>");
            writer.newLine();
            writer.write("<text x=\"" + String.valueOf(150 + x * 250)+  "\" y=\"" + String .valueOf(225 + y * 250)
                    + "\" font-size=\"20\" fill=\"" + textColor + "\" style='dominant-baseline:middle;text-anchor:middle;'>" + String.valueOf(color.index) + ". " + color.name + "</text>");
            writer.newLine();
            writer.write("<text x=\"" + String.valueOf(150 + x * 250)+  "\" y=\"" + String .valueOf(250 + y * 250)
                    + "\" font-size=\"20\" fill=\"" + textColor + "\" style='dominant-baseline:middle;text-anchor:middle;'>" + color.roma + "</text>");
            writer.newLine();
            writer.write("<text x=\"" + String.valueOf(150 + x * 250)+  "\" y=\"" + String .valueOf(275 + y * 250)
                    + "\" font-size=\"20\" fill=\"" + textColor + "\" style='dominant-baseline:middle;text-anchor:middle;'>" +
                    "C:" + color.cmyk.substring(0,3) + ",M:" + color.cmyk.substring(3,6) + ",Y:" + color.cmyk.substring(6,9)
                    + ",K:" + color.cmyk.substring(9,12)
                    + "</text>");
            writer.newLine();
            writer.write("<text x=\"" + String.valueOf(150 + x * 250)+  "\" y=\"" + String .valueOf(300 + y * 250)
                    + "\" font-size=\"20\" fill=\"" + textColor + "\" style='dominant-baseline:middle;text-anchor:middle;'> #" + color.rgb + "</text>");
            writer.newLine();
            writer.newLine();
            x++;
        }

        writer.newLine();
        writer.write("</svg>");

        writer.close();
    }

    public static ArrayList<Color> takeColors(ArrayList<Color> colors, int[] indexs){
        Color[] color = colors.toArray(new Color[0]);
        ArrayList<Color> result = new ArrayList<Color>();
        for(int x : indexs) {
            result.add(color[x-1]);
        }
        return result;
    }

    public static void toACT(ArrayList<Color> colors, String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
        fileOutputStream.write(new byte[]{0,0,0,(byte)255,(byte)255,(byte)255});
        int x = 0;
        for(Color color : colors) {
            fileOutputStream.write(Integer.parseInt(color.rgb.substring(0,2), 16));
            fileOutputStream.write(Integer.parseInt(color.rgb.substring(2,4), 16));
            fileOutputStream.write(Integer.parseInt(color.rgb.substring(4,6), 16));
            x++;
            if(x >= 254)
                break;
        }
        fileOutputStream.close();

    }

}