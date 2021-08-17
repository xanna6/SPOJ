package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NWD {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = Integer.parseInt(br.readLine());

        ArrayList<String> tables = new ArrayList<>();
        for (int i = 0; i < numberOfTests; i++) {
            tables.add(br.readLine());
        }
        for (String numbers : tables) {
            String[] dividents = numbers.split(" ");
            int a = Integer.parseInt(dividents[0]);
            int b = Integer.parseInt(dividents[1]);
        System.out.println(findNWD(a,b));
        }
    }

    public static int findNWD(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int result = max - min;
        if (result != max) {
            return findNWD(min, result);
        } else {
            return result;
        }
    }
}
