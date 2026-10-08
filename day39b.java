public import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        long l = Long.parseLong(st.nextToken());

        long[] a = new long[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(a);

        double ans = Math.max(a[0], l - a[n - 1]);

        for (int i = 1; i < n; i++) {
            double gap = (a[i] - a[i - 1]) / 2.0;
            ans = Math.max(ans, gap);
        }

        System.out.printf("%.10f%n", ans);
    }
} day39b {
    
}
