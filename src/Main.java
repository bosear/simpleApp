import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Артём on 07.05.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        List<List<Integer>> table = getTable();
        System.out.println(table.toString());
        check(table);
    }

    public static List<List<Integer>> getTable() throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("table.txt"));
        List<List<Integer>> table = new ArrayList<>();
        int i = 0;
        String[] words;
        String line;

        while ((line = in.readLine()).length() != 0) {
            table.add(new ArrayList<Integer>());
            words = line.split(" ");
            for (int j = 0; j < words.length; j++)
                table.get(i).add(Integer.parseInt(words[j]));
            ++i;
        }
        return table;
    }

    public static void check(List<List<Integer>> table) {
        int summ = 0;
        int count = 0;

        for (int i = 0; i < table.get(0).size(); i++)
            summ += table.get(0).get(i);

        // проверка колонок

        for (int j = 0; j < table.get(0).size(); j++) {
            for (int i = 0; i < table.size(); i++)
                count += table.get(i).get(j);

            if (count != summ) {
                System.out.println("[проверка колонок] Это не магический квадрат!");
                return;
            }
            count = 0;
        }
        // проверка строк
        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < table.get(0).size(); j++)
                count += table.get(i).get(j);

            if (count != summ) {
                System.out.println("[проверка строк] Это не магический квадрат!");
                return;
            }

            count = 0;
        }


        // проверка диагоналей
        for (int i = 0; i < table.size(); i++)
            count += table.get(i).get(i);

        if (count != summ) {
            System.out.println("[проверка диагоналей 1] Это не магический квадрат!");
            return;
        }

        count = 0;

        for(int i=0, j = table.size() - 1; i<table.size(); j--, i++)
                count += table.get(i).get(j);

        if (count != summ) {
            System.out.println("[проверка диагоналей 2] Это не магический квадрат!");
            return;
        }
        else
            System.out.println("Это магический квадрат!");
    }
}
