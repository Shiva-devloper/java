import java.util.*;
public class EVENODD {
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A NUMBER :-");
        int num= sc.nextInt();
        if((num%2==0)){
            System.out.println("EVEN NUMBER");

        }
         else{
             System.out.println("ODD NUMBER");
         }
    }
}
