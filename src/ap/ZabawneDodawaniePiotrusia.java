package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ZabawneDodawaniePiotrusia {

    private static int numberOfadding =0;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = Integer.parseInt(br.readLine());

        if (numberOfTests <= 80) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < numberOfTests; i++) {
                numbers.add(Integer.parseInt(br.readLine()));
            }
            for (int number : numbers) {
                checkPalindrom(number);
                numberOfadding=0;
            }
        }
    }

    public static void checkPalindrom(int number) {
        char[] chars = String.valueOf(number).toCharArray();
        char[] reversedChars = new char[chars.length];
        for (int i = 0; i < reversedChars.length; i++) {
            reversedChars[i] = chars[reversedChars.length - 1 - i];
        }
        int reversedNumber = Integer.parseInt(String.valueOf(reversedChars));

        if (number != reversedNumber) {
            number = number + reversedNumber;
            numberOfadding++;
            checkPalindrom(number);
        }
        if (number == reversedNumber) {
            System.out.println(number + " " + numberOfadding);
        }
    }
}
