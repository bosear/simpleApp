import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Артём on 07.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Queque queque = new Queque();
        queque.add("Moscow");
        queque.add("London");
        queque.add("Tokyo");
        queque.add("Samara");

        for (int i = 0; i < queque.length(); i++)
            System.out.println(queque.get(i).getDescription());

        System.out.println();

        Iterator<Queque.Node> iterator = queque.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next().getDescription());

        queque.remove(0);
        System.out.println();

        iterator = queque.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next().getDescription());
    }
}
