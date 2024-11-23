import java.util.*;
public class factorial{
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
        f =f*i;
        }

return ;
    }
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("enter a n number ");
int n =sc.nextInt();
fact(n);
System.out.println("the factorial of n is ");
System.out.println(f);

}
}