package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WiekSegmentolka {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());
        List <String> list = new ArrayList<>();

        for (int i = 0; i < numberOfDatasets; i++) {
            list.add(br.readLine());
        }

        List <Integer> result = new ArrayList<>();

        for (String s:list) {
            String[] data = s.split(" ");
            int segment = Integer.parseInt(data[0]);
            int leg = 0;
            for (int i = 1; i < data.length; i++) {
                leg = leg + Integer.parseInt(data[i]);
            }
            result.add(calculateAge(segment,leg));
        }
        for (int age:result) {
            System.out.println(age);
        }
    }

    public static int calculateAge(int segment, int leg) {
        int age = 0;
        return age + (segment - 1) + leg;
    }
}
