import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int p = Integer.parseInt(input[0]);
            int q = Integer.parseInt(input[1]);

            if (q - p >= 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}