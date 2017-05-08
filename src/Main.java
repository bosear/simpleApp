import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Артём on 07.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String dir = "./src";
        String name = ".java";
        File file = new File(dir);
        String[] strings = file.list( (x, y) -> {return y.endsWith(name);});

        for(String str : strings)
            System.out.println(str);
    }
}
