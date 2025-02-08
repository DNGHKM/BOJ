import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] arr = {13, 7, 5, 3, 3, 2};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = 0;
        double b = 1.5;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            a += arr[i] * Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            b += arr[i] * Integer.parseInt(st.nextToken());
        }
        if (a < b) {
            System.out.println("ekwoo");
        }else{
            System.out.println("cocjr0208");
        }
    }
}