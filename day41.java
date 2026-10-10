```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            if (a[0] != a[1] && a[0] != a[2]) {
                System.out.println(1);
            } else if (a[0] != a[1]) {
                System.out.println(2);
            } else {
                for (int i = 2; i < n; i++) {
                    if (a[i] != a[0]) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }

        sc.close();
    }
}
```