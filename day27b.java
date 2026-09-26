import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long countMin = 0;
        long countMax = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            if (x < min) {
                min = x;
                countMin = 1;
            } else if (x == min) {
                countMin++;
            }

            if (x > max) {
                max = x;
                countMax = 1;
            } else if (x == max) {
                countMax++;
            }
        }

        long difference = max - min;
        long ways;

        if (min == max)
            ways = (long) n * (n - 1) / 2;
        else
            ways = countMin * countMax;

        System.out.println(difference + " " + ways);
    }
}