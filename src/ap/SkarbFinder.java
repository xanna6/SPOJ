package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class SkarbFinder {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfDatasets = Integer.parseInt(br.readLine());
        List <String> list = new LinkedList<>();
        for (int i = 0; i < numberOfDatasets; i++) {
            int numberOfTips = Integer.parseInt(br.readLine());
                list.add(findFinalWay(br, numberOfTips));

        }
        for (String s:list
             ) {
            System.out.println(s);
        }
    }

    public static String findFinalWay(BufferedReader bufferedReader, int tips) throws IOException {
        int stepsNorth = 0;
        int stepsSouth = 0;
        int stepsWest = 0;
        int stepsEast = 0;
        for (int i = 0; i < tips; i++) {
            String tip = bufferedReader.readLine();
            String[] group = tip.split(" ");
            int direction = Integer.parseInt(group[0]);
            int steps = Integer.parseInt(group[1]);
            if (direction == 0) {
                stepsNorth = stepsNorth + steps;
            }
            if (direction == 1) {
                stepsSouth = stepsSouth + steps;
            }
            if (direction == 2) {
                stepsWest = stepsWest + steps;
            }
            if (direction == 3) {
                stepsEast = stepsEast + steps;
            }
        }
        int stepsNorthSouth = 0;
        int directionNorthSouth = 0;
        int stepsWestEast = 0;
        int directionWestEast = 0;

        if (stepsNorth >= stepsSouth) {
            stepsNorthSouth = stepsNorth - stepsSouth;
            directionNorthSouth = 0;
        } else {
            stepsNorthSouth = stepsSouth - stepsNorth;
            directionNorthSouth = 1;
        }
        if (stepsWest >= stepsEast) {
            stepsWestEast = stepsWest - stepsEast;
            directionWestEast = 2;
        } else {
            stepsWestEast = stepsEast - stepsWest;
            directionWestEast = 3;
        }
        if (stepsNorthSouth > 0 && stepsWestEast > 0) {
            return directionNorthSouth + " " + stepsNorthSouth + "\n" +
             directionWestEast + " " + stepsWestEast;
        }
        if (stepsNorthSouth > 0) {
            return directionNorthSouth + " " + stepsNorthSouth;
        }
        if (stepsWestEast > 0) {
            return directionWestEast + " " + stepsWestEast;
        }
        if (stepsNorthSouth == 0 && stepsWestEast == 0) {
            return "studnia";
        }
        return null;
    }
}
