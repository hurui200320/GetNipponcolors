package info.skyblond.getNipponcolors;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ColorReader {
    private static Gson gson = new Gson();
    public static Color readJson(String json){
        return gson.fromJson(json,Color.class);
    }

    public static ArrayList<Color> readFile(String path) throws IOException {
        Path path1 = Paths.get(path);
        List<String> lines = Files.readAllLines(path1);
        ArrayList<Color> colors = new ArrayList<>();
        for(String s : lines){
            colors.add(readJson(s));
        }
        return colors;
    }
}
