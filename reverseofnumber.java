import java.util.*;
public class reverseofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n =sc.nextInt();
        System.out.println("reverseof  a number is ");
        while (n>0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n =n / 10;
        }
   System.out.println();
 
    }
}
