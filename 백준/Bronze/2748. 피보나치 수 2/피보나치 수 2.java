import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n+1];
        arr[0] = 0;
        if(n>=1) arr[1] = 1;
        if(n>2) arr[2] = 1;
        for (int i = 3; i <arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.stream(arr).max().getAsLong());
    }
}