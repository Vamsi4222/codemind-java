import java.util.Scanner;

public class MonopolisticAdvantage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int r1 = scanner.nextInt();
            int r2 = scanner.nextInt();
            int r3 = scanner.nextInt();
            
            if ((r1 > r2 + r3) || (r2 > r1 + r3) || (r3 > r1 + r2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        
    }
}
