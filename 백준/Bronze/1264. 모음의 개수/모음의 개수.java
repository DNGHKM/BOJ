import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            int count=0;
            String input = br.readLine();
            if(input.equals("#")){
                break;
            }else{
                char[] arr =new char[input.length()];
                for (int i = 0; i <input.length()-1; i++) {
                    arr[i]=input.charAt(i);
                }
                for (char a : arr) {
                    if(a == 'a'||a == 'e'||a == 'i'||a == 'o'||a == 'u'){
                        count++;
                    }else if(a == 'A'||a == 'E'||a == 'I'||a == 'O'||a == 'U') {
                        count++;
                    }
                }
            }
            bw.write(count+"\n");
            bw.flush();
        }
    }
}