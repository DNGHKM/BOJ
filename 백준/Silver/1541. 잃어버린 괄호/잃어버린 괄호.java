import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        for (int i = 0; i <input.length(); i++) {
            char inputChar = input.charAt(i);
            if (inputChar != '+' && inputChar != '-') {
                sb.append(inputChar);
            } else if(inputChar=='+'){
                String tmp = sb.toString();
                list.add(Integer.parseInt(tmp));
                sb = new StringBuilder();
            } else {
                String tmp = sb.toString();
                list.add(Integer.parseInt(tmp));
                sb = new StringBuilder();
                sb.append(inputChar);
            }
            if(i==input.length()-1){
                String tmp = sb.toString();
                list.add(Integer.parseInt(tmp));
            }
        }
        int status = 1;
        for (Integer a : list) {
            if(a<0) {
                status =-1;
            }
            if(status == 1){
                result+=a;
            } else{
                result-=Math.abs(a);
            }
        }
        System.out.println(result);
    }
}