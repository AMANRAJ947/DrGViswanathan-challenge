import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n - 1; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        BigInteger ans = fact.multiply(BigInteger.TWO)
                              .divide(BigInteger.valueOf(n));

        System.out.println(ans);
    }
}