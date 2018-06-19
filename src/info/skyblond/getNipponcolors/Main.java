package info.skyblond.getNipponcolors;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static Gson gson = new Gson();
    public static void main(String[] args) throws IOException {
        ColorGetter.readToFile();   //Read colors from 4 different website and write them to file with json
        ArrayList<Color> colors = ColorReader.readFile("./nipponcolors.com.json");//Read one
        //output as markdown table
        System.out.println("Colors from [nipponcolors.com](http://nipponcolors.com) :");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|View|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|<font color=\"#" + color.rgb + "\">" + color.name + "</font>|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|<font color=\"#" + color.rgb + ">■■■</font>|");
        System.out.println();

        colors.clear();//another one
        colors = ColorReader.readFile("./www.colordic.org.json");
        System.out.println("Colors from [www.colordic.org](https://www.colordic.org/w/) :");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|View|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|<font color=\"#" + color.rgb + "\">" + color.name + "</font>|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|<font color=\"#" + color.rgb + ">■■■</font>|");
        System.out.println();

        colors.clear();
        colors = ColorReader.readFile("./irocore.com.json");
        System.out.println("Colors from [irocore.com](https://irocore.com) :");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|View|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|<font color=\"#" + color.rgb + "\">" + color.name + "</font>|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|<font color=\"#" + color.rgb + ">■■■</font>|");
        System.out.println();

        colors.clear();
        colors = ColorReader.readFile("./tool.chinaz.com.json");
        System.out.println("Colors from [tool.chinaz.com](http://tool.chinaz.com/tools/cj) :");
        System.out.println("|Name|Roma|C|M|Y|K|RGB|View|");
        System.out.println("|:----:|:----:|:----:|:----:|:----:|:----:|:----:|:----:|");
        for(Color color: colors)
            System.out.println("|<font color=\"#" + color.rgb + "\">" + color.name + "</font>|" + color.roma + "|" + color.cmyk.substring(0,3) + "|" + color.cmyk.substring(3,6) + "|" +
                    color.cmyk.substring(6,9) + "|" + color.cmyk.substring(9,12) + "| \\#" + color.rgb.toUpperCase() + "|<font color=\"#" + color.rgb + ">■■■</font>|");
        System.out.println();

    }
}