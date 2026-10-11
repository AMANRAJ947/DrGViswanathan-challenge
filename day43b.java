```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0;
        boolean magic = true;

        while (i < s.length()) {
            if (s.startsWith("144", i)) {
                i += 3;
            } else if (s.startsWith("14", i)) {
                i += 2;
            } else if (s.charAt(i) == '1') {
                i++;
            } else {
                magic = false;
                break;
            }
        }

        System.out.println(magic ? "YES" : "NO");
        sc.close();
    }
}
```