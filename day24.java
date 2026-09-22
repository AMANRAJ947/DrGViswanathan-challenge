import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int last = 1;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int turns = (a + m - 1) / m;

            if (turns >= max) {
                max = turns;
                last = i;
            }
        }

        System.out.println(last);
    }
}