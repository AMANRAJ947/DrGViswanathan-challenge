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

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            int[] ans = new int[n];

            PriorityQueue<Segment> pq = new PriorityQueue<>((a, b) -> {
                if (a.length() != b.length())
                    return b.length() - a.length();

                return a.l - b.l;
            });

            pq.add(new Segment(0, n - 1));

            for (int i = 1; i <= n; i++) {
                Segment cur = pq.poll();

                int mid = (cur.l + cur.r) / 2;
                ans[mid] = i;

                if (cur.l <= mid - 1) {
                    pq.add(new Segment(cur.l, mid - 1));
                }

                if (mid + 1 <= cur.r) {
                    pq.add(new Segment(mid + 1, cur.r));
                }
            }

            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}