import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];
        arr[0]= 1;
        arr[1]= 2;
        for (int i = 2; i <arr.length; i++) {
            arr[i] = (arr[i-1]+arr[i-2])%10007;
        }
        System.out.print(arr[n-1]);
    }
}