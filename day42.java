```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prev = sc.nextInt();

        int count = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {
            int curr = sc.nextInt();

            if (curr >= prev) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
            prev = curr;
        }

        System.out.println(max);
        sc.close();
    }
}
```