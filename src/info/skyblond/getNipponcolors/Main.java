package info.skyblond.getNipponcolors;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //ColorGetter.readToFile();   //Read colors from 4 different website and write them to file with json
        ArrayList<Color> colors = ColorReader.readFile("./nipponcolors.com.json");//Read one
        //output as markdown table
        //toMarkdownTable(colors,"NipponColors","nipponcolors.com","http://nipponcolors.com/");
        //output SVG(control)
        //toSVG(colors,"NipponColors");
        //output SVG(file)
        toSVG(colors,"NipponColors","./NipponColors.svg");

        colors.clear();//another one
        colors = ColorReader.readFile("./www.colordic.org.json");
        //toMarkdownTable(colors,"ColorDic","www.colordic.org","https://www.colordic.org/w/");
        toSVG(colors,"ColorDic","./ColorDic.svg");

        colors.clear();
        colors = ColorReader.readFile("./irocore.com.json");
        //toMarkdownTable(colors,"IroCore","irocore.com","https://irocore.com");
        toSVG(colors,"IroCore","./IroColor.svg");


    }

    public static void toMarkdownTable(ArrayList<Color> colors, String name, String web, String url){
        System.out.println("## " + name);
        System.out.println("\nColors from [" + web +"](" + url + ") :\n");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|" + color.name + "|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|");
        System.out.println();
    }

    public static void toSVG(ArrayList<Color> colors, String tittle){
        System.out.println("<?xml version=\"1.0\" standalone=\"no\"?>");
        System.out.println("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">");
        System.out.println();
        System.out.println("<svg width=\"100%\" height=\"100%\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">");
        System.out.println();
        System.out.println("<text x=\"650\" y=\"50\" font-size=\"30\" fill=\"black\" style='dominant-baseline:middle;text-anchor:middle;'>" + tittle + "</text>");
        System.out.println();
        int x = 0, y = 0;
        for(Color color : colors){
            if( x > 4){
                x = 0;y++;
            }
            System.out.println("<rect  x=\"" + String.valueOf(50 + x * 250)+  "\" y=\"" + String .valueOf(100 + y * 250)
                    + "\" width=\"200\" height=\"100\" style=\"fill:rgb(" + Integer.parseInt(color.rgb.substring(0,2),16) + "," + Integer.parseInt(color.rgb.substring(2,4),16)
                    + "," + Integer.parseInt(color.rgb.substring(4,6),16) + ");dominant-baseline:middle;text-anchor:middle;\"/>");
            System.out.println("<text x=\"" + String.valueOf(150 + x * 250)+  "\" y=\"" + String .valueOf(225 + y * 250)
                    + "\" font-size=\"20\" fill=\"black\" style='dominant-baseline:middle;text-anchor:middle;'>" + color.name + "</text>");
            System.out.println("<text x=\"" + String.valueOf(150 + x * 250)+  "\" y=\"" + String .valueOf(250 + y * 250)
                    + "\" font-size=\"20\" fill=\"black\" style='dominant-baseline:middle;text-anchor:middle;'>" + color.roma + "</text>");
            System.out.println("<text x=\"" + String.valueOf(150 + x * 250)+  "\" y=\"" + String .valueOf(275 + y * 250)
                    + "\" font-size=\"20\" fill=\"black\" style='dominant-baseline:middle;text-anchor:middle;'>" +
                    "C:" + color.cmyk.substring(0,3) + ",M:" + color.cmyk.substring(3,6) + ",Y:" + color.cmyk.substring(6,9)
                    + ",K:" + color.cmyk.substring(9,12)
                    + "</text>");
            System.out.println("<text x=\"" + String.valueOf(150 + x * 250)+  "\" y=\"" + String .valueOf(300 + y * 250)
                    + "\" font-size=\"20\" fill=\"black\" style='dominant-baseline:middle;text-anchor:middle;'> #" + color.rgb + "</text>");
            System.out.println();
            x++;
        }

        System.out.println();
        System.out.println("</svg>");

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
                    + "\" font-size=\"20\" fill=\"" + textColor + "\" style='dominant-baseline:middle;text-anchor:middle;'>" + color.name + "</text>");
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

}