import java.util.Scanner;
public class vamsi{
    public static void main(String[]args){
        int a,b,c,d;
        Scanner h=new Scanner (System.in);
        a=h.nextInt();
        b=h.nextInt();
        c=h.nextInt();
        d=h.nextInt();
        if(a>=10&&b>=10&&c>=10&&d>=10){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}