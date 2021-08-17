package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Obżartuchy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());

        int participants = 0;
        int cookiesInBox = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numberOfDatasets; i++) {
            String data = br.readLine();
            String[] competition = data.split(" ");
            participants = Integer.parseInt(competition[0]);
            cookiesInBox = Integer.parseInt(competition[1]);

            int [] time = new int[participants];
            for (int j = 0; j < participants; j++) {
                time[j] = Integer.parseInt(br.readLine());
            }
            list.add(countboxes(cookiesInBox, time));
        }
        for (Integer integer: list) {
            System.out.println(integer);
        }
    }

    public static int countboxes(int cookiesInBox, int[] time) {
        int eatenCookies = 0;
        for (int i = 0; i < time.length; i++) {
            int cookies = 24 * 60 * 60 / time[i];
            eatenCookies = eatenCookies + cookies;
        }
        return (int) Math.ceil( (double) eatenCookies/cookiesInBox);
    }
}
