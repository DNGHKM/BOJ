import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> sayHello = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        for (int i = 0; i <n; i++) {
            String input = br.readLine();
            if(input.equals("ENTER")){
                num += sayHello.size();
                sayHello.clear();
            }else{
                sayHello.add(input);
            }
        }
        num+=sayHello.size();
        bw.write(num+"");
        bw.flush();
    }
}