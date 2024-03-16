import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[10];
        arr[9]=1;
        for (int i = 1; i <9; i++) {
            arr[i]=1;
        }
        for (int i = 0; i < n-1; i++) {
            long[] tmp = new long[10];
            for (int j = 0; j <= 9; j++) {
                if(j>0) tmp[j - 1]+=arr[j]%1_000_000_000;
                if(j<9) tmp[j + 1]+=arr[j]%1_000_000_000;
            }
            arr = tmp;
        }
        long sum = Arrays.stream(arr).sum();
        System.out.println(sum%1_000_000_000);
    }
}