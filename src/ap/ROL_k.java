package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ROL_k {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dataset = br.readLine();
        String[] data = dataset.split(" ");
        int arraySize = Integer.parseInt(data[0]);
        int shift = Integer.parseInt(data[1]);
        String table = br.readLine();
        String[] numbers = table.split(" ");
        int[] tab = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            tab[i] = Integer.parseInt(numbers[i]);
        }
        moveArrayElements(tab,shift);
    }

    public static void moveArrayElements(int[] tab, int shift) {
        int[] shiftedtab = new int[tab.length];
        for (int i = 0; i < shiftedtab.length; i++) {
            if (i < (shiftedtab.length-shift)) {
                shiftedtab[i] = tab[i + shift];
            } else {
                shiftedtab[i] = tab[shift-tab.length+i];
            }
            System.out.print(shiftedtab[i] + " ");
        }
    }
}
