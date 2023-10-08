import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[(int)Math.log10(n)+1];
        StringBuilder sf = new StringBuilder();
        for (int i = 0; i <arr.length; i++) {
            arr[i]=n%10;
            n/=10;
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i>=0; i--) {
            sf.append(arr[i]);
        }
        System.out.println(sf);
    }
}