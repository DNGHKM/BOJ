import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long[] arrSum = new long[n];
        int targetGroup=0;
        long son;
        long mother;
        for (int i = 0; i <n; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i <arrSum.length; i++) {
            arrSum[i]= (long) (i + 1) *(i+2)/2;
        }
        for (int i = 0; i <arr.length; i++) {
            if(n>arrSum[i]){
                targetGroup=i+1;
            } else if (n==arrSum[i]) {
                targetGroup =i;
            }
        }
        if(targetGroup%2==1){
            son = n-arrSum[targetGroup-1];
            mother = targetGroup+2-son;
        } else if(n==1) {
            son=1;
            mother=1;
        }else{
            mother = n-arrSum[targetGroup-1];
            son = targetGroup+2-mother;
        }
        System.out.printf("%d/%d",son,mother);
    }
}