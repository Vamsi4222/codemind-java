import java.util.Scanner;
public class vamsi{
    public static void main(String[]args){
        char a;
        Scanner h=new Scanner (System.in);
        a=h.next().charAt(0);
        if(a=='V'){
            System.out.println("Voilet");
        }
        else if(a=='I'){
            System.out.println("Indigo");
        }
        else if(a=='B'){
            System.out.println("Blue");
        }
        else if(a=='G'){
            System.out.println("Green");
        }
        else if(a=='Y'){
            System.out.println("Yellow");
        }
        else if(a=='O'){
            System.out.println("Orange");
        }
        else if (a=='R'){
            System.out.println("Red");
        }
        else {
            System.out.println("-1");
        }
    }
}