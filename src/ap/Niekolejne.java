package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Niekolejne {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int biggestNumber = Integer.parseInt(br.readLine());
        displayRandomNumbers(biggestNumber);
    }

    public static void displayRandomNumbers(int biggestNumber) {
        if (biggestNumber < 3) {
            System.out.println("NIE");
            return;
        }
        int[] tab = new int[biggestNumber + 1];
        for (int i = 0; i <= biggestNumber; i++) {
            tab[i] = i;
        }
        int[] random = new int[tab.length];
        random[0] = tab[biggestNumber / 2];
        System.out.print(random[0] + " ");
        int max = tab[tab.length-1];
        int min = tab[0];
        while (min != random[0] && max != random[0]) {
            System.out.print(max + " " + min + " ");
            max--;
            min++;
        }
    }
    public static void displayRandomNumbers2(int biggestNumber) {
        if (biggestNumber < 3) {
            System.out.println("NIE");
            return;
        }
        int[] tab = new int[biggestNumber + 1];
        for (int i = 0; i <= biggestNumber; i++) {
            tab[i] = i;
        }
        int[] random = new int[tab.length];
        random[0] = tab[biggestNumber / 2];
        System.out.print(random[0]);
        int max = tab[tab.length-1];
        int min = tab[0];
        boolean addLastNumber = true;
        for (int i = 1; i < tab.length; i++) {
            if (addLastNumber) {
                random[i] = max;
                max--;
                addLastNumber = false;

            } else {
                random[i] = min;
                min++;
                addLastNumber = true;
            }
            System.out.print(" "+random[i]);
        }
    }
}
