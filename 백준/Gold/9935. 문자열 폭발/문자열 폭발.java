import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        String bomb = br.readLine();
        for (int i = input.length()-1; i >= 0; i--) {
            stack.push(input.charAt(i));
            if(stack.peek()==bomb.charAt(0)&&stack.size()>=bomb.length()){
                boolean check=true;
                int tmp = 0;
                for (int j = stack.size()-1; j >=stack.size()-bomb.length(); j--) {
                    if(bomb.charAt(tmp)!=stack.get(j)) {
                        check=false;
                        break;
                    }
                    tmp++;
                }
                if(check){
                    for (int j = 0; j <bomb.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()){
            bw.write("FRULA");
        }else{
            while(!stack.isEmpty()) {
                bw.write(stack.pop());
            }
        }
        bw.flush();
    }
}