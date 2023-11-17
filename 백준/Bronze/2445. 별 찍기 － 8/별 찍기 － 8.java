import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 2*n-2;
        int b = 1;
        for (int i = 0; i <n; i++){
            for (int j = 0; j <2*n; j++) {
                if(b<=j&&j<=a){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            b++;
            a--;
            System.out.print("\n");
        }
        a = n;
        b = n-1;
        for (int i = 0; i <n-1; i++){
            for (int j = 0; j <2*n; j++) {
                if(b<=j&&j<=a){
                    System.out.print(" ");
                    continue;
                }
                System.out.print("*");
            }
            b--;
            a++;
            System.out.print("\n");
        }
    }
}