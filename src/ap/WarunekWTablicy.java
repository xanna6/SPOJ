package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WarunekWTablicy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfData = Integer.parseInt(br.readLine());
        int[] numbers = new int[numberOfData];

        for (int i = 0; i < numberOfData; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        String condition = br.readLine();
        String[] s = condition.split(" ");
        char character = s[0].charAt(0);
        int range = Integer.parseInt(s[1]);

        for (int i = 0; i < numbers.length; i++) {
            if (character == '>') {
                if (numbers[i]>range) {
                    System.out.println(numbers[i]);
                }
            }
            if (character == '<') {
                if (numbers[i]<range) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
