import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long l = sc.nextLong();

        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        Arrays.sort(a);

        long maxGap = 0;

        for (int i = 1; i < n; i++) {
            maxGap = Math.max(maxGap, a[i] - a[i - 1]);
        }

        double ans = Math.max(a[0], l - a[n - 1]);
        ans = Math.max(ans, maxGap / 2.0);

        System.out.printf("%.10f%n", ans);
    }
}