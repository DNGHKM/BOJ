import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] point = new int[n];
        int[] dist = new int[n-1];
        for (int i = 0; i < n; i++) {
            point[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i <n-1; i++) {
            dist[i] = point[i+1]-point[i];
        }
        int gcd = dist[0];
        for (int i = 0; i <dist.length; i++) {
            gcd = GCD(dist[i],gcd);
        }
        System.out.println((point[point.length-1]-point[0])/gcd-n+1);
    }
    private static int GCD(int a, int b) {
        if(a%b==0){
            return b;
        }else{
           return GCD(b,a%b);
        }
    }
}