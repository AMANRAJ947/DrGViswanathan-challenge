import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int n = Integer.parseInt(st.nextToken());

            if (n < 4) {
                sb.append("-1\n");
                continue;
            }

            // 1. Append odd numbers in descending order
            int startOdd = (n % 2 != 0) ? n : n - 1;
            for (int i = startOdd; i >= 1; i -= 2) {
                sb.append(i).append(" ");
            }

            // 2. Append 4 and 2
            sb.append("4 2 ");

            // 3. Append remaining even numbers in ascending order
            for (int i = 6; i <= n; i += 2) {
                sb.append(i).append(" ");
            }

            sb.append("\n");
        }

        System.out.print(sb);
    }
}