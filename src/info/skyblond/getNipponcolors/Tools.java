package info.skyblond.getNipponcolors;

public class Tools {
    public String formatCMYK(int c){
        String m;
        if (c < 10)
            m = "00" + String.valueOf(c);
        else if (c < 100)
            m = "0" + String.valueOf(c);
        else
            m = "100";
        return m;
    }
}
