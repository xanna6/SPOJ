package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Polowa {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();

        for (int i = 0; i < numberOfTests; i++) {
            list.add(br.readLine());
        }
        for (String sequence:list) {
            divideInHalf(sequence);
            System.out.println();
        }
    }

    public static void divideInHalf(String sequence) {
        char[] charArray = sequence.toCharArray();
        for (int i = 0; i < (charArray.length) / 2; i++) {
            System.out.print(charArray[i]);
        }
    }
}
