import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            String word = sc.next();

            if (word.length() > 10) {
                int count = word.length() - 2;

                System.out.println(
                    word.charAt(0) + "" + count + word.charAt(word.length() - 1)
                );
            } else {
                System.out.println(word);
            }
        }

        sc.close();
    }
}