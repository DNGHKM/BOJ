import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n/3];
        int k =0;
        for (int i = 0; i <=n/3; i++) {
            for (int j = 0; j <=n/5 ; j++) {
                if(3*i+5*j==n){
                    arr[k]=i+j;
                    k++;
                }
            }
        }
        if(arr[0]!=0){
            System.out.println(arr[0]);
        }else {
            System.out.println(-1);
        }
    }
}