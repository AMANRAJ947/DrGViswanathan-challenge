public class Solution {
    public static void solve(int n) {
        if (n <= 30) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            if (n == 36 || n == 40 || n == 44) {
                System.out.println("6 10 15 " + (n - 31));
            } else {
                System.out.println("6 10 14 " + (n - 30));
            }
        }
    }

    public static void main(String[] args) throws java.io.IOException {
        // Fast I/O for competitive programming
        java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.util.StringTokenizer tokenizer = null;

        String line = reader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                line = reader.readLine();
                if (line == null) break;
                tokenizer = new java.util.StringTokenizer(line);
            }
            int n = Integer.parseInt(tokenizer.nextToken());

            if (n <= 30) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
                if (n == 36 || n == 40 || n == 44) {
                    sb.append("6 10 15 ").append(n - 31).append("\n");
                } else {
                    sb.append("6 10 14 ").append(n - 30).append("\n");
                }
            }
        }
        System.out.print(sb);
    }
}