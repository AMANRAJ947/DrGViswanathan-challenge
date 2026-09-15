import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int cur = 1;
        long time = 0;

        for (int i = 0; i < m; i++) {
            int next = sc.nextInt();

            if (next >= cur)
                time += next - cur;
            else
                time += n - cur + next;

            cur = next;
        }

        System.out.println(time);
    }
}