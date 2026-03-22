import java.util.Scanner;

public class prime {
    
    public static String solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        
        // Handle edge cases
        if (n <= 1) {
            return "not prime";
        }
        
        // Only need to check up to square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "not prime";
            }
        }
        
        return "prime";
    }
    
    public static void main(String[] args) {
        System.out.println(solve());
    }
}