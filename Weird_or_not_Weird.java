import java.util.Scanner;
public class esn{
    public static void main(String[]args){
        int n;
        Scanner h=new Scanner(System.in);
        n=h.nextInt();
        if(n%2==0&&n<=5){
            System.out.println("not weird");
        }
        else if(n%2==0&&n>=6&&n<=20){
            System.out.println("weird");
        }
        else if(n%2==0&&n>20){
            System.out.println("not weird");
        }
        else{
            System.out.println("weird");
        }
    }
}