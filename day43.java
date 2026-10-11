```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long minCount = 0, maxCount = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();

            if (x < min) {
                min = x;
                minCount = 1;
            } else if (x == min) {
                minCount++;
            }

            if (x > max) {
                max = x;
                maxCount = 1;
            } else if (x == max) {
                maxCount++;
            }
        }

        long diff = max - min;
        long ways;

        if (diff == 0) {
            ways = (long) n * (n - 1) / 2;
        } else {
            ways = minCount * maxCount;
        }

        System.out.println(diff + " " + ways);
        sc.close();
    }
}
```