package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DwieCyfrySilni {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfData = Integer.parseInt(br.readLine());

        List <Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfData; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        for (int number:list) {
            System.out.println(dwieCyfrySilni(number));
        }
    }

    public static String dwieCyfrySilni(int n) {
        if (n<10) {
            long x = obliczSilnie(n);
            long jednosci = x%10;
            long dziesiatki = x/10%10;
            return dziesiatki + " " + jednosci;
        }
        return "0 0";
    }
    public static long obliczSilnie(int liczba) {
        long wynik = 1;
        if (liczba >= 2) {
            wynik = liczba*obliczSilnie(liczba-1);
        }
        return wynik;
    }
}
