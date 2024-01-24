import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = 1000-sc.nextInt();
        int ans = 0;
        int m = 500;
        for (int i = 0; i <6; i++) {
            int num;
            ans += num = c/m;
            c-=num*m;
            if(i%2==0){
                m/=5;
            }else{
                m/=2;
            }
        }
        System.out.print(ans);
    }
}