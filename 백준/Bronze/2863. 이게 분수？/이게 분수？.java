import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[4];
        for (int i = 0; i <4; i++) {
            arr[i]=sc.nextInt();
        }
        double max = cal(arr);
        int count = 0;
        for (int i = 0; i <4; i++) {
            if(max<cal(arr)){
                max=cal(arr);
                count = i;
            }
            rotate(arr);
        }
        System.out.println(count);
    }
    private static void rotate(double[] arr) {
        double tmp=arr[0];
        arr[0]=arr[2];
        arr[2]=arr[3];
        arr[3]=arr[1];
        arr[1]=tmp;
    }
    private static double cal(double[] arr) {
        return((arr[0] /arr[2])+(arr[1] /arr[3]));
    }
}