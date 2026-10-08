import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of rides needed
        int m = sc.nextInt(); // rides covered by special ticket
        int a = sc.nextInt(); // cost of one ride ticket
        int b = sc.nextInt(); // cost of m-ride ticket
        
        // Option 1: Buy all single ride tickets
        int cost1 = n * a;
        
        // Option 2: Buy k special tickets + single tickets for remainder
        int k = n / m;
        int remaining = n % m;
        int cost2 = k * b + remaining * a;
        
        // Option 3: Buy (k+1) special tickets (may overbuy)
        int cost3 = (k + 1) * b;
        
        // Find minimum cost
        int minCost = Math.min(cost1, Math.min(cost2, cost3));
        
        System.out.println(minCost);
        
        sc.close();
    }
}