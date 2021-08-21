package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZliczanieWystapien {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLines = Integer.parseInt(br.readLine());
        String data = "";
        for (int i = 0; i < numberOfLines; i++) {
            data = data + br.readLine();
            }

        char[] chars = data.toCharArray();

        countASCIICode(chars);
    }


    public static void countASCIICode(char[] charArray) {
        int quantity = 0;
        for (int i = 0; i < 128; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == i) {
                    quantity++;
                }
            }
            if (quantity > 0) {
                System.out.println(i + " " + quantity);
                quantity = 0;
            }
        }
    }
}
