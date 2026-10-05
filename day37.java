import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n < 4) {
                System.out.println(-1);
                continue;
            }
            StringBuilder sb = new StringBuilder();
            // Print odd numbers in decreasing order
            for (int i = n; i >= 1; i--) {
                if (i % 2 == 1) {
                    sb.append(i).append(" ");
                }
            }
            // Print 4, 2
            sb.append("4 2 ");
            // Print remaining even numbers from 6 to n
            for (int i = 6; i <= n; i += 2) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}