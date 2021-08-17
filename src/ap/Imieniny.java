package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Imieniny {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());

        ArrayList<String> tables = new ArrayList<>();
        for (int i = 0; i < numberOfDatasets; i++) {
            tables.add(br.readLine());
        }
        for (String numbers : tables) {
            String[] nameDAy = numbers.split(" ");
            int people = Integer.parseInt(nameDAy[0]) - 1;
            int candies = Integer.parseInt(nameDAy[1]);
            System.out.println(checkLeftCandies(people, candies));
        }
    }

    public static String checkLeftCandies(int people, int candies) {
        int leftCandies = 0;
        if (candies < people) {
            return "TAK";
        } else {
            leftCandies = candies % people;
            if (leftCandies == 0) {
                return "NIE";
            } else {
                return "TAK";
            }
        }
    }
}

