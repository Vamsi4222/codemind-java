import java.util.Scanner;
public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String octalInput = scanner.nextLine();
        scanner.close();
        
        int decimalOutput = Integer.parseInt(octalInput, 8);
        
        System.out.println(decimalOutput);
    }
}
