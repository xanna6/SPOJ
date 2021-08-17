package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GraEuklidesa {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());

        ArrayList<String> tables = new ArrayList<>();
        for (int i = 0; i < numberOfDatasets; i++) {
            tables.add(br.readLine());
        }
        for (String numbers : tables) {
            String[] token = numbers.split(" ");
            int a = Integer.parseInt(token[0]);
            int b = Integer.parseInt(token[1]);
            System.out.println(countTokens(a, b));
        }
    }

    public static int countTokens(int tokensA, int tokensB) {
        while (tokensA-tokensB>0 || tokensB-tokensA>0) {
        if (tokensA>=tokensB) {
            if (tokensB == 0) break;
            tokensA = tokensA - tokensB;
        }
        else {
            if (tokensA == 0) break;
            tokensB = tokensB - tokensA;
        }
    }
        return tokensA + tokensB;
    }
}

