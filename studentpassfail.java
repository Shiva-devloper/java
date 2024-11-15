import java.util.*;
public class studentpassfail {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in) ;
    System.out.println("ENTER A MARKS OF FIVE SUBJECT :-"); 
    System.out.println("MATHS:-"); 
    int maths =sc.nextInt();
    System.out.println("PHYSICS:-"); 
    int physics =sc.nextInt();
    System.out.println("CHEMISTRY:-"); 
    int chemistry  =sc.nextInt();
    System.out.println("ENGLISH:-"); 
    int english  =sc.nextInt();
    System.out.println("HINDI:-"); 
    int hindi =sc.nextInt();
   int sum =maths+physics+chemistry+english+hindi;
    System.out.println("YOUR TOTAL MARKS OF FIVE SUBJECT IS:-");
    System.out.println(sum);
    String result =(sum>175)?"pass":"fail";
    System.out.println(result);
    }
}
