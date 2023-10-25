import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(GCD(a, b));
        System.out.println(a*b/GCD(a,b));
    }
    private static int GCD(int a, int b) {
        while(b!=0){
            int tmp =a;
            a=b;
            b=tmp%b;
        }
        return a;
    }
}
