import java.util.*;
public class largestthreenumber {
 
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the A number");
        int a =sc.nextInt();
        System.out.println("enter the B number");
        int b =sc .nextInt();
        System.out.println("enter the C number");
        int c =sc .nextInt();
        if((a>=b)&& (a>=c)){
            System.out.println("A IS GRATTER NUMBER");

        }
        else if ( b>=c){
            System.out.println("B IS GRATTER NUMBER");
        }
        else{
            System.out.println("C IS A GRATTER NUMBER");
        }

    }
}

