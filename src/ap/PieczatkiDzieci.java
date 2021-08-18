package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class PieczatkiDzieci {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        String[] data = line.split(" ");
//        int initialNumber = Integer.parseInt(data[0]);
//        int numberOfFives = Integer.parseInt(data[1]);
        BigDecimal initialNumber = new BigDecimal(data[0]);
        int numberOfFives = Integer.parseInt(data[1]);

        System.out.println(findNumerWithFives(initialNumber,numberOfFives));
    }

    public static BigDecimal findNumerWithFives(BigDecimal initialNumber, int numberOfFives) {
        int five = 0;
        initialNumber = initialNumber.add(new BigDecimal(1));
        while (true) {
            char[] number = String.valueOf(initialNumber).toCharArray();
            for (char character:number) {
                if (character == '5') {
                    five++;
                }
            }
            if (five == numberOfFives) {
                return new BigDecimal(number);
            }
            else {
                five = 0;
                initialNumber = initialNumber.add(new BigDecimal(1));
            }
        }
    }
}
