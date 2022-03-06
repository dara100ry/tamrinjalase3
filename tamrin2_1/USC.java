package src.tamrin2_1;

import java.util.Scanner;

public class USC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your two numbers:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        mohasebe mohasebe=new mohasebe();
        System.out.println("a+b="+mohasebe.sum(a,b)); 
        System.out.println("a-b="+mohasebe.sub(a,b));
        System.out.println("a.b="+mohasebe.mul(a,b));
        System.out.println("a/b="+mohasebe.dev(a,b));

      
        
    }
}
