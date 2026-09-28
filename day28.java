import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int pos = s.indexOf('0');

        if (pos == -1)
            pos = s.length() - 1;

        System.out.println(s.substring(0, pos) + s.substring(pos + 1));
    }
}