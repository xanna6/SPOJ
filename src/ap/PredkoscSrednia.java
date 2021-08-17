package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PredkoscSrednia {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());

        ArrayList<String> tables = new ArrayList<>();
        for (int i = 0; i < numberOfDatasets; i++) {
            tables.add(br.readLine());
        }
        for (String numbers : tables) {
            String[] velocity = numbers.split(" ");
            int v1 = Integer.parseInt(velocity[0]);
            int v2 = Integer.parseInt(velocity[1]);
            System.out.println(calculateAverageVelocity(v1, v2));
        }
    }

    public static int calculateAverageVelocity(int v1, int v2) {
        return (2*v1*v2)/(v1+v2);
    }
}
