import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int length = (int) Math.pow(2, n-1);
        int ans = 0;
        while(length!=0){
            int num = length*length;
            if(r<length&&c>=length){
                c-=length;
                ans += num;
            }else if(r>=length&&c<length){
                r-=length;
                ans+=num*2;
            }else if(r>=length){
                c-=length;
                r-=length;
                ans+=num*3;
            }
            length/=2;
        }
        System.out.println(ans);
    }
}