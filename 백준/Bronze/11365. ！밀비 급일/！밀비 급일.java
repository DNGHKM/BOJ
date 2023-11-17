import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String input = br.readLine();
            if(input.equals("END")) break;
            for (int i = input.length()-1; i >= 0; i--) {
                bw.write(input.charAt(i));
            }
            bw.write("\n");
        }
        bw.flush();
    }
}