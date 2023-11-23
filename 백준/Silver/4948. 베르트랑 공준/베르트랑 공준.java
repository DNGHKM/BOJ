import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                return;
            }
            int[] arr = new int[2*n+1];
            for (int i = 0; i <arr.length; i++) {
                arr[i] =i;
            }
            arr[1]=0;
            for (int i =n; i <=2*n; i++) {
                for (int j = 2; j <= Math.sqrt(2*n); j++) {
                    if(i!=j&&i%j==0){
                        arr[i] =0;
                        break;
                    }
                }
            }
            int count = 0;
            for (int i = n+1; i <=2*n ; i++) {
                if(arr[i]!=0){
                    count++;
                }
            }
            System.out.println(count);;
        }
    }
}