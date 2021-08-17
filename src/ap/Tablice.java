package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tablice {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTurnovers = Integer.parseInt(br.readLine());

        if (numberOfTurnovers <= 100) {
            ArrayList<String> tables = new ArrayList<>();
            for (int i = 0; i < numberOfTurnovers; i++) {
                tables.add(br.readLine());
            }
            for (String table : tables) {
                turnOverMatrix(table);
                System.out.println();
            }
        } else {
            System.out.println("Zbyt duża ilość tablic.");
        }

    }

    public static void turnOverMatrix(String data) {
        String[] numbersArray = data.split(" ");

        int arraySize = Integer.parseInt(numbersArray[0]);

        String[] numbersArray2 = new String[arraySize];

        for (int i = 0; i < numbersArray2.length; i++) {
            numbersArray2[i] = numbersArray[i + 1];
        }
        for (int i = numbersArray2.length-1; i >= 0; i--) {
            System.out.print(numbersArray2[i] + " ");
        }
    }
}
