import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
            System.out.println(Cal(n));
    }
    private static int Cal(int n) {
        if (n==1){
            return 1;
        }
        if (n>=2) {
            return Cal(n-2)+Cal(n-1);
        }else {
            return n;
        }
    }
}