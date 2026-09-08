import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            // Count how many are sure about the solution
            int sureCount = petya + vasya + tonya;
            
            // If at least two are sure, they will implement it
            if (sureCount >= 2) {
                count++;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}