package info.skyblond.getNipponcolors;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static Gson gson = new Gson();
    public static void main(String[] args) throws IOException, InterruptedException {
        //ColorGetter.readToFile();   //Read colors from 4 different website and write them to file with json
        ArrayList<Color> colors = ColorReader.readFile("./nipponcolors.com.json");//Read one
        //output as markdown table
        System.out.println("## NipponColors");
        System.out.println("\nColors from [nipponcolors.com](http://nipponcolors.com) :\n");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|" + color.name + "|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|");
        System.out.println();

        colors.clear();//another one
        colors = ColorReader.readFile("./www.colordic.org.json");
        System.out.println("## ColorDic");
        System.out.println("\nColors from [www.colordic.org](https://www.colordic.org/w/) :\n");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|" + color.name + "|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|");
        System.out.println();

        colors.clear();
        colors = ColorReader.readFile("./irocore.com.json");
        System.out.println("## IroCore");
        System.out.println("\nColors from [irocore.com](https://irocore.com) :\n");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|" + color.name + "|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|");
        System.out.println();

    }
}