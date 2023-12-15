import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        int num = 1;
        for (int i = 0; i <b; i++) {
            for (int j = 0; j <num; j++) {
                arr.add(num);
            }
            num++;
        }
        int[] s = new int[b+1];
        s[0] = 0;
        for (int i = 1; i <s.length; i++) {
            s[i] = s[i-1]+arr.get(i-1);
        }
        System.out.println(s[b]-s[a-1]);
    }
}