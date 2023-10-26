import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Fac(n)/(Fac(m)*Fac(n-m)));
    }
    private static int Fac(int a) {
        if(a==0||a==1){
            return 1;
        }else{
            return  a*Fac(a-1);
        }
    }
}