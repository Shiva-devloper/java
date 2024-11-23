import java.util.*;
public  class hollow {
public static void hellow_rect(int tc, int tr){
for(int i=1;i<=tc;i++){
    for(int j=1;j<=tr;j++){
if(i==1 || i==tc || j==1 || j==tr )
{ System.out.print("*");}
else{System.out.print( " ");}


    }
    System.out.println( );
}


}

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("ENTER THE COLOUM:-");
    int a = sc.nextInt();
    System.out.println("ENTER THE ROW :-");
    int b = sc.nextInt();
    hellow_rect(a , b);
}
}