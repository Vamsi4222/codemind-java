import java.util.*;
public class main{
    public static void main(String[]args){
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}