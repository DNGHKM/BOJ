import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        sum[0] = arr[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1]+arr[i];
        }
        for (int i = 0; i <m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==1){
                System.out.println(sum[b-1]);
            }else{
                System.out.println(sum[b-1]-sum[a-2]);
            }
        }
    }
}