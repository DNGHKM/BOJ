import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[46];
        arr[0]=arr[1]=0;
        arr[1]=arr[2]=1;
        for (int i = 2; i <arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
}