import java.util.*;
public class triangle{
    public static void main(String[]args){
        Scanner k=new Scanner(System.in);
        float a=k.nextFloat();
        float b=k.nextFloat();
        float c=k.nextFloat();
        double s=(a+b+c)/2;
        double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}