import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int[] arr = new int[m+1];
        for (int i = 2; i < m+1; i++) {
            for (int j = n; j <m+1; j++) {
                if(i==j){
                    continue;
                }
                if (j%i==0){
                    arr[j] = -1;
                }
            }
        }
        arr[1]=-1;
        for (int i = 0; i <m+1; i++) {
            if(i>=n&&arr[i]!=-1){
                sum+=i;
            }
        }
        if(sum!=0){
            System.out.println(sum);
        }else {
            System.out.println(-1);
        }
        for (int i = 0; i <m+1; i++) {
            if(i>=n&&arr[i]!=-1){
                System.out.println(i);
                break;
            }
        }
    }
}