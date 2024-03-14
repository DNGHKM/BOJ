import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[1]=1;
        for (int i = 2; i <arr.length; i++) {
            if(i%2==0){
                arr[i] = arr[i-1]*2+1;
            }else{
                arr[i] = arr[i-1]*2-1;
            }
            arr[i]%=10007;
        }
        System.out.print(arr[n]);
    }
}