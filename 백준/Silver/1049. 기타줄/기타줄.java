import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int minSet = 1000;
        int minEa = 1000;
        for (int i = 0; i <m; i++) {
            st = new StringTokenizer(br.readLine());
            int set = Integer.parseInt(st.nextToken());
            int ea = Integer.parseInt(st.nextToken());
            if(set<minSet){
                minSet = set;
            }
            if(ea<minEa){
                minEa = ea;
            }
        }
        int allEa = n*minEa;
        int allSet = n/6*minSet;
        if(n%6!=0){
            allSet = ((n/6)+1)*minSet;
        }
        int mix = n/6*minSet+n%6*minEa;
        int result = Math.min(allEa,allSet);
        System.out.println(Math.min(result,mix));
    }
}