import java.util.*;
public class prodcut {
    public static int pro( int a, int b){
       int prodd= a*b;
        return prodd;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        System.out.println("ENTER A FIRST NUMBER :-");
        int a =sc.nextInt();
        System.out.println("ENTER A SECOND NUMBER :-");
        int b =sc.nextInt();
      int mul=  pro(a, b);
      System.out.println("YOUR MULTIPLY OF TWO NUMBER IS :-" + mul );

    }
}
