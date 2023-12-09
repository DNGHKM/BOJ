import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        boolean[] play = new boolean[n*l+(n-1)*5];
        Arrays.fill(play, true);
        for (int i = l; i <play.length; i+=l+5) {
            for (int j = i; j <i+5; j++) {
                if(j<=play.length-1) {
                    play[j] = false;
                }
            }
        }
        int i = d;
        while(true) {
            if(i<play.length) {
                if (!play[i]) {
                    System.out.println(i);
                    return;
                }
            }else{
                System.out.println(i);
                return;
            }
            i+=d;
        }
    }
}
