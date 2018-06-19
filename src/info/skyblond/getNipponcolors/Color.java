package info.skyblond.getNipponcolors;

public class Color {
    public String name,roma;
    Color(String name,String roma){
        this.name = name;
        this.roma = roma;
    }

    public String cmyk = "------------",rgb = "000000";
    public int index = -1;

    public void setProperties(String index,String cmyk,String rgb){
        this.index = Integer.parseInt(index);
        this.cmyk = cmyk;
        this.rgb = rgb;
    }

    public String url = "";

    @Override
    public String toString(){
        String result = name + "( " + roma.toLowerCase() + " ): \n" +
                "\tCMYK: \n" +
                    "\t\tCyan: " + cmyk.substring(0,3) + "\n" +
                    "\t\tMagenta: " + cmyk.substring(3,6) + "\n" +
                    "\t\tYellow: " + cmyk.substring(6,9) + "\n" +
                    "\t\tKey Plate: " + cmyk.substring(9) + "\n" +
                "\tRGB: #" + rgb + "\n" +
                    "\t\tRed: " + Integer.parseInt(rgb.substring(0,2),16) + "\n" +
                    "\t\tGreen: " + Integer.parseInt(rgb.substring(2,4),16) + "\n" +
                    "\t\tBlue: " + Integer.parseInt(rgb.substring(4,6),16) + "\n";
        return result;
    }
}
