package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Przedszkolanka {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());
        ArrayList<String> tables = new ArrayList<>();
        for (int i = 0; i < numberOfDatasets; i++) {
            tables.add(br.readLine());
        }
        for (String numbers : tables) {
            String[] group = numbers.split(" ");
            int a = Integer.parseInt(group[0]);
            int b = Integer.parseInt(group[1]);
            if (a >= 10 && b >= 10){
                if (a <= 30 && b <=30) {
                    System.out.println(findNWW(a, b));
                } else {
                    System.out.println("Zbyt duża liczba.");
                }
            } else {
                System.out.println("Zbyt mała liczba.");
            }
        }
    }

    public static int findNWW(int group1, int group2) {
        int[] a = new int[group2];
        int[] b = new int[group1];

        for (int i = 1; i <= group2; i++) {
            a[i - 1] = group1 * i;
        }
        for (int i = 1; i <= group1; i++) {
            b[i - 1] = group2 * i;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    return a[i];
                }
            }
        }
        return 1;
    }
}