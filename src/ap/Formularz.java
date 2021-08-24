package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Formularz {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(checkCorrectnessOfData(loadData(line)));
    }

    public static String[] loadData(String line) {
        String data = line.replace("Imie: ", "").replace(" Nazwisko: ", "").replace(" Data ur.: ", "");
        String[] stringArray = data.split(";");
        return stringArray;
    }

    public static int checkCorrectnessOfData(String[] stringArray) {
        String name = stringArray[0];
        String surname = stringArray[1];
        String dateOfBirth = stringArray[2];
        System.out.println(name);
        System.out.println(surname);
        System.out.println(dateOfBirth);
        if (!(name.matches("[A-Z][a-z]*"))) {
            return 0;
        }
        if (!(surname.matches("[A-Z][a-z]*"))) {
            return 1;
        }
        String[] date = dateOfBirth.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        if ((year<1900 && year>2000) && (month>12) && (day>31)) {
            return 2;
        }
        return 3;
    }
}
