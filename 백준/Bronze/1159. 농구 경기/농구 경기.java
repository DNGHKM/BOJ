import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <n; i++) {
            char input = br.readLine().charAt(0);
            arr[input-97]++;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=5){
                sb.append((char)(i+97));
            }
        }
        if(sb.length()==0){
            sb.append("PREDAJA");
        }
        System.out.println(sb);
    }
}