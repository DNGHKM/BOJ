import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i <n; i++) {
            arr[i] = br.readLine();
        }
        char[][] tmp = new char[n][arr[0].length()];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <arr[0].length(); j++) {
                tmp[i][j]=arr[i].charAt(j);
            }
        }
        for (int i = 0; i <tmp[0].length ; i++) {
            char tmpChar = tmp[0][i];
            boolean test = true;
            for (int j = 0; j <tmp.length ; j++) {
                if(tmp[j][i]!=tmpChar){
                    test = false;
                    break;
                }
            }
            if (test){
                bw.write(tmpChar);
            }else{
                bw.write('?');
            }
        }
        bw.flush();
    }
}