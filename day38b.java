import java.io.*;
import java.util.*;

public class Main {

    static class Segment {
        int l, r;

        Segment(int l, int r) {
            this.l = l;
            this.r = r;
        }

        int length() {
            return r - l + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] ans = new int[n];

            PriorityQueue<Segment> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.length() != b.length())
                        return Integer.compare(b.length(), a.length());

                    return Integer.compare(a.l, b.l);
                }
            );

            pq.add(new Segment(0, n - 1));

            int value = 1;

            while (!pq.isEmpty()) {
                Segment cur = pq.poll();

                int l = cur.l;
                int r = cur.r;
                int len = cur.length();

                int mid;

                if (len % 2 == 1) {
                    mid = (l + r) / 2;
                } else {
                    mid = (l + r - 1) / 2;
                }

                ans[mid] = value++;

                // Left zero segment
                if (l <= mid - 1) {
                    pq.add(new Segment(l, mid - 1));
                }

                // Right zero segment
                if (mid + 1 <= r) {
                    pq.add(new Segment(mid + 1, r));
                }
            }

            for (int i = 0; i < n; i++) {
                out.append(ans[i]).append(" ");
            }

            out.append("\n");
        }

        System.out.print(out);
    }
}