import java.util.*;
public class ternaryopertor {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("ENTER A NUMBER");
int number = sc.nextInt();  
String type= ( ( number%2)==0 ) ? "even" : "odd"  ;
System.out.println(type);
    }
}
