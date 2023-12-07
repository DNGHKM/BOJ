import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int subs = sc.nextInt();
        double x = (double) (sum + subs) /2;
        double y = sum-x;
        if(x*10%10==0&&y*10%10==0&&x>=0&&y>=0){
            System.out.println((int)Math.max(x,y)+" "+(int) Math.min(x,y));
        }else{
            System.out.println(-1);
        }
    }
}