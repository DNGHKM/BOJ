import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int three = Integer.parseInt(st.nextToken());
        int[] arr = new int[101];
        for (int i = 0; i <3; i++) {
            st=new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = start; j <end; j++) {
                arr[j]++;
            }
        }
        int result=0;
        for (int a : arr) {
            if(a==1){
                result+=a*one;
            } else if (a==2) {
                result+=a*two;
            }else{
                result+=a*three;
            }
        }
        System.out.println(result);
    }
}