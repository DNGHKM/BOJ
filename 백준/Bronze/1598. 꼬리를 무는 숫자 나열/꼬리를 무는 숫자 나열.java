import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int aX = (int)Math.ceil((double)a/4);
        int bX = (int)Math.ceil((double)b/4);
        int aY = a%4;
        int bY = b%4;
        if(aY==0){
            aY=4;
        }
        if(bY==0){
            bY=4;
        }
        int horizon = Math.abs(aY-bY);
        int vertical = Math.abs(aX-bX);
        System.out.println(horizon+vertical);
    }
}
