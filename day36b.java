import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] a = new long[n];

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }

        long countMin = 0;
        long countMax = 0;

        for (long x : a) {
            if (x == min) countMin++;
            if (x == max) countMax++;
        }

        long difference = max - min;
        long ways;

        if (min == max) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = countMin * countMax;
        }

        System.out.println(difference + " " + ways);
    }
}