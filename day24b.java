import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cnt = new int[8];

        for (int i = 0; i < n; i++)
            cnt[sc.nextInt()]++;

        StringBuilder ans = new StringBuilder();

        while (cnt[1] > 0 && cnt[2] > 0 && cnt[4] > 0) {
            ans.append("1 2 4\n");
            cnt[1]--;
            cnt[2]--;
            cnt[4]--;
        }

        while (cnt[1] > 0 && cnt[2] > 0 && cnt[6] > 0) {
            ans.append("1 2 6\n");
            cnt[1]--;
            cnt[2]--;
            cnt[6]--;
        }

        while (cnt[1] > 0 && cnt[3] > 0 && cnt[6] > 0) {
            ans.append("1 3 6\n");
            cnt[1]--;
            cnt[3]--;
            cnt[6]--;
        }

        if (cnt[1] != 0 || cnt[2] != 0 || cnt[3] != 0 ||
            cnt[4] != 0 || cnt[5] != 0 || cnt[6] != 0 ||
            cnt[7] != 0) {
            System.out.println("-1");
        } else {
            System.out.print(ans);
        }
    }
}