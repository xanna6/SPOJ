package ap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SzyfrCezara {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();

        while (true) {
            final String line = br.readLine();
            if (line == null) break;

            list.add(line);
        }
        List<String> cipher = new ArrayList<>();
        for (String s : list) {
            char[] chars = s.toCharArray();
            char[] encryptedChars = new char[chars.length];
            for (int i = 0; i < chars.length; i++) {
                encryptedChars[i] = encrypt(chars[i]);
            }
            cipher.add(String.valueOf(encryptedChars));
        }
        for (String words:cipher) {
            System.out.println(words);
        }
    }

    public static char encrypt(char znak) {
        if (znak == 32) {
            return znak;
        }
        if (znak < 'X') {
            return (char) (znak + 3);
        } else {
            return (char) (znak - 22);
        }
    }
}
