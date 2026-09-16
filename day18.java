import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int max = a[0], min = a[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] <= min) {
                min = a[i];
                minIndex = i;
            }
        }

        int ans = maxIndex + (n - 1 - minIndex);

        if (maxIndex > minIndex)
            ans--;

        System.out.println(ans);
    }
}