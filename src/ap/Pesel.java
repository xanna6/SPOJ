package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pesel {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());

        ArrayList<String> tables = new ArrayList<>();
        for (int i = 0; i < numberOfDatasets; i++) {
            tables.add(br.readLine());
        }
        for (String pesel : tables) {
            System.out.println(checkIfPeselIsCorrect(pesel));
        }
    }

    public static String checkIfPeselIsCorrect(String pesel) {

        int sum = 0;
        char[] charArray = pesel.toCharArray();
        int[] cyfryPeselu = new int[11];
        for (int i = 0; i < charArray.length; i++) {
            cyfryPeselu[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        sum = cyfryPeselu[0]+3*cyfryPeselu[1]+7*cyfryPeselu[2]+9*cyfryPeselu[3]+cyfryPeselu[4]+3*cyfryPeselu[5]+
                7*cyfryPeselu[6]+9*cyfryPeselu[7]+cyfryPeselu[8]+3*cyfryPeselu[9]+cyfryPeselu[10];
        if (sum<0) {
            return "N";
        } else if (sum%10 != 0) {
            return "N";
        } else {
            return "D";
        }
    }
}
