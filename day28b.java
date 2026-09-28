import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int i = 0;
        boolean ok = true;

        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                i++;

                if (i < s.length() && s.charAt(i) == '4') {
                    i++;

                    if (i < s.length() && s.charAt(i) == '4')
                        i++;
                }
            } else {
                ok = false;
                break;
            }
        }

        System.out.println(ok ? "YES" : "NO");
    }
}