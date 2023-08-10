import java.util.Scanner;
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double average = (num1 + num2) / 2.0;
        System.out.printf("Average of %d and %d is: %.2f", num1, num2, average);
    }
}
