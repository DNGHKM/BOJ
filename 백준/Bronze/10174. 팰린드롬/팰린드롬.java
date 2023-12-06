import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            if(Check(br.readLine().toLowerCase())){
                bw.write("Yes\n");
            }else{
                bw.write("No\n");
            }
        }
        bw.flush();
    }
    private static boolean Check(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<=right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
}