import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true) {
            try {
                String input = br.readLine();
                if (input == null) break;
                st = new StringTokenizer(input);
                int n = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                System.out.println(s / (n + 1));
            }catch (Exception e1){
                break;
            }
        }
    }
}