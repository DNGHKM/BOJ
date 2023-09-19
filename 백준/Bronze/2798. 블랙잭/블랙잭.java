import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] sum = new int[n*(n-1)*(n-2)/6];
        int l = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k <n; k++) {
                    if(i!=j&&j!=k) {
                        sum[l] = arr[i] + arr[j] + arr[k];
                        l++;
                    }
                }
            }
        }
        int max = 0;
        for (int i : sum) {
            if (max < i && i <= m) {
                max = i;
            }
        }
        System.out.println(max);
    }
}