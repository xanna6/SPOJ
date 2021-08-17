package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Kalkulator {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> tables = new ArrayList<>();
        List <Integer> result = new ArrayList<>();
        String readLine = "";
        while ((readLine = br.readLine()) != null) {
            System.out.println(readLine);
            tables.add(readLine);
        }
        br.close();
            for (String data : tables) {
                String[] number = data.split(" ");
                char character = number[0].charAt(0);
                int number1 = Integer.parseInt(number[1]);
                int number2 = Integer.parseInt(number[2]);
                result.add(calculator(character, number1, number2));
            }
        System.out.println(result);
        }


    public static int calculator(char character, int number1, int number2) {
        if (character == '+') {
            return number1 + number2;
        }
        if (character == '-') {
            return number1 - number2;
        }
        if (character == '*') {
            return number1 * number2;
        }
        if (character == '/') {
            return number1 / number2;
        }
        if (character == '%') {
            return  number1 % number2;
        }
        return 0;
    }
}
