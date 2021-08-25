package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SumyWielokrotne {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        String line = "";

        while (true) {
            line = br.readLine();
            if (line.equals("")) {
                break;
            }
            list.add(line);
        }
        int sum = 0;
        for (String s : list) {
            System.out.println(sum(s));
            sum = sum + sum(s);
        }
        System.out.println(sum);
    }

    public static int sum(String numbers) {
        String[] array = numbers.split(" ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + Integer.parseInt(array[i]);
        }
        return sum;
    }
}
