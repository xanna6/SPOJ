package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProblemCollatza {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());

        ArrayList<String> tables = new ArrayList<>();
        for (int i = 0; i < numberOfDatasets; i++) {
            tables.add(br.readLine());
        }
        for (String number : tables) {
            int firstTerm = Integer.parseInt(number);
            System.out.println(sequence(firstTerm));

        }
    }

    public static int sequence(int s) {
        int result = 0;
        int i = 0;
        if (s == 1) {
            return 0;
        }
        while (result != 1) {
            if (i == 0) {
                result = s;
            }
            if (result % 2 != 0) {
                i++;
                result = 3 * result + 1;
            } else {
                i++;
                result = result / 2;
            }
        }
        return i;
    }
}

