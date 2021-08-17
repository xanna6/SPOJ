package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dwumiany {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = Integer.parseInt(br.readLine());

        ArrayList<String> tables = new ArrayList<>();
        for (int i = 0; i < numberOfTests; i++) {
            tables.add(br.readLine());
        }
        for (String data : tables) {
            String[] number = data.split(" ");
            int n = Integer.parseInt(number[0]);
            int k = Integer.parseInt(number[1]);
            System.out.println(dwumianNewtona(n, k));
        }
    }

    public static long dwumianNewtona(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        else {
            return dwumianNewtona(n-1, k-1) + dwumianNewtona(n-1, k);
        }
    }
}
