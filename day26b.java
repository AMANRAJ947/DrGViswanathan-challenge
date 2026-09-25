import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        int coins = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                coins += a[i - 1] + 1 - a[i];
                a[i] = a[i - 1] + 1;
            }
        }

        System.out.println(coins);
    }
}