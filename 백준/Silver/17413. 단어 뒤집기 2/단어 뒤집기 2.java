import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        boolean reverse = true;
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            char tmp = input.charAt(i);
            if(tmp=='<') {
                reverse=false;
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
            if(reverse){
                if(tmp!=' ') stack.add(tmp);
                if(tmp==' '||i==input.length()-1){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                }
            }else{
                sb.append(tmp);
                if(tmp=='>') reverse=true;
            }
        }
        System.out.println(sb);
    }
}