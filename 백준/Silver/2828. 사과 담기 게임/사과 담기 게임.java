import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(br.readLine());
        int left = 1;
        int right = left+m-1;
        int ans = 0;
        for (int i = 0; i <j; i++) {
            int move;
            int drop = Integer.parseInt(br.readLine());
            if(drop<left){
                move = left-drop;
                ans+=move;
                left-=move;
                right-=move;
            }else if(right<drop){
                move = drop-right;
                ans+=move;
                right+=move;
                left +=move;
            }
        }
        System.out.println(ans);
    }
}