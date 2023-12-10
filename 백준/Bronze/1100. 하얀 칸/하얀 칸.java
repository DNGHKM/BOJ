import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count =0;
        for (int i = 0; i <8; i++) {
            String input = br.readLine();
            if(i%2==0){
                for (int j = 0; j <input.length(); j+=2) {
                    if(input.charAt(j)=='F'){
                        count++;
                    }
                }
            }else{
                for (int j = 1; j <input.length() ; j+=2) {
                    if(input.charAt(j)=='F'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
