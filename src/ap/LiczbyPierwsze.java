package ap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.ArrayList;

class LiczbyPierwsze {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int howManyTests = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < howManyTests; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int n : list) {
            isPrimeNumber(n);
        }
    }

    public static void isPrimeNumber(int number) {
        if (number > 10000) {
            return;
        }
        if (number < 2) {
            System.out.println("NIE");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("NIE");
                return;
            }
        }
        System.out.println("TAK");
    }
}