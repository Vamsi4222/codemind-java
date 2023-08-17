import java.util.Scanner;
public class vamsi{
    public static void main(String[]args){
        char ch;
        Scanner Scanner=new Scanner (System.in);
         ch=Scanner.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("uppercase alphabet");
        }
        else if (ch>='a' && ch<='z'){
            System.out.println("lowercase alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}