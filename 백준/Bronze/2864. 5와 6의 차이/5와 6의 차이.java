import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.print((min(n)+min(m))+" "+(max(n)+max(m)));
    }
    private static int max(int n) {
        int maxNum=n;
        int count = (int)Math.log10(n)+1;
        for (int i = 0; i <count; i++) {
            if(n%10==5){
                maxNum+=(int)Math.pow(10,i);
            }
            n/=10;
        }
        return maxNum;
    }
    private static int min(int n) {
        int minNum=n;
        int count = (int)Math.log10(n)+1;
        for (int i = 0; i <count; i++) {
            if(n%10==6){
                minNum-=(int)Math.pow(10,i);
            }
            n/=10;
        }
        return minNum;
    }
}