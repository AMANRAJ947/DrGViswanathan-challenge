import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        // Remove '+'
        s = s.replace("+", "");

        // Convert to character array
        char[] arr = s.toCharArray();

        // Sort in ascending order
        Arrays.sort(arr);

        // Print with '+'
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print("+");
            }
            System.out.print(arr[i]);
        }

        sc.close();
    }
}