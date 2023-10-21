import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n != 0){
            System.out.println(Factorial(n));
        }else{
            System.out.println(1);
        }
    }
    private static long Factorial(int n) {
        if (n>1) {
            return n*Factorial(n-1);
        }else {
            return n;
        }
    }
}