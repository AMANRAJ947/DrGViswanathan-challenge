```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> {
                int len1 = x[1] - x[0] + 1;
                int len2 = y[1] - y[0] + 1;

                if (len1 != len2) {
                    return len2 - len1;
                }
                return x[0] - y[0];
            });

            pq.offer(new int[]{0, n - 1});

            for (int i = 1; i <= n; i++) {
                int[] seg = pq.poll();
                int l = seg[0];
                int r = seg[1];

                int mid = (l + r) / 2;
                a[mid] = i;

                if (l < mid) {
                    pq.offer(new int[]{l, mid - 1});
                }
                if (mid < r) {
                    pq.offer(new int[]{mid + 1, r});
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
```