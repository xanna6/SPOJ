package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Flamaster {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfWords = Integer.parseInt(br.readLine());

        if (numberOfWords <= 50) {
            ArrayList<String> words = new ArrayList<>();
            for (int i = 0; i < numberOfWords; i++) {
                words.add(br.readLine());
            }
            for (String word : words) {
                countLetters(word);
            }

        } else {
            System.out.println("Zbyt duża ilość słów.");
        }
    }

    public static void countLetters(String str) {
        str = str + ".";
        char[] charArray = str.toCharArray();

        int numberOfLetters = 1;

        for (int i = 1; i < charArray.length; i++) {

            if (charArray[i] == charArray[i-1]) {
                numberOfLetters = numberOfLetters + 1;
                continue;
            }
            if (charArray[i] != charArray[i-1]) {
                System.out.print(charArray[i-1]);
                if (numberOfLetters == 1) {
                    continue;
                }
                if (numberOfLetters == 2) {
                    System.out.print(charArray[i-1]);
                }
                else {
                    System.out.print(numberOfLetters);
                }
                numberOfLetters = 1;
            }
        }
        System.out.println();
    }
}
