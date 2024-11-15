import java.util.*;
public class incometaxcalculator {

    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER a INCOME :-");
        int income= sc.nextInt();
        int tax;
        if(income<500000){
            System.out.println("0% tax");

        }
        else if (income>=500000 && income<=1000000){
            tax=(int) (income*0.2);
            System.out.println(" your tax amount is "+ tax);
        }
         else  {
             System.out.println("30% tax");
         }
    }
}


