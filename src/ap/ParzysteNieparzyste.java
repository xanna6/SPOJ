package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ParzysteNieparzyste {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());

            ArrayList<String> tables = new ArrayList<>();
            for (int i = 0; i < numberOfDatasets; i++) {
                tables.add(br.readLine());
            }
            for (String table : tables) {
                String[] numbersArray = table.split(" ");

                int arraySize = Integer.parseInt(numbersArray[0]);

                String[] tab = new String[arraySize];

                for (int i = 0; i < tab.length; i++) {
                    tab[i] = numbersArray[i + 1];
                }
                displayEvenIndexThenUnevenIndex(arraySize, tab);
                System.out.println();
            }

    }

    public static void displayEvenIndexThenUnevenIndex (int arraySize, String[] tab) {
        for (int i = 1; i < arraySize; i=i+2) {
            System.out.print(tab[i] + " ");
        }
        for (int i = 0; i < arraySize; i=i+2) {
            System.out.print(tab[i] + " ");
        }
    }
}
