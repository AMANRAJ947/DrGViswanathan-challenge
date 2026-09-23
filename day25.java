import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine().trim();

        int len = n.length();
        int ans = (1 << len) - 2;

        for (char c : n.toCharArray()) {
            ans = ans * 2 + (c == '7' ? 1 : 0);
        }

        System.out.println(ans + 1);
    }
}