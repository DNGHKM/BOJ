import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        C e = new C();
        System.out.println(e.d(a,b));
    }
}
class C {
    public static long d(long n,long m ){
        return (n+m)*(n-m);
    }
}