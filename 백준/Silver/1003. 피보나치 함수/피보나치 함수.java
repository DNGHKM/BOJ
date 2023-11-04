import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[41];
        for (int i = 0; i <=40; i++) {
            arr[0] = 1;
            arr[1] = 0;
            if(i>1){
                arr[i]=arr[i-2]+arr[i-1];
            }
        }
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i <t; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input>1) {
                bw.write(arr[input] + " " + (arr[input] + arr[input - 1])+"\n");
            } else if(input==0){
                bw.write(1 + " " + 0+"\n");
            } else{
                bw.write(0 + " " + 1+"\n");
            }
            bw.flush();
        }
    }
}