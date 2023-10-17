import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stSK= new Stack<>();
        Stack<Character> stLR= new Stack<>();
        int count =0;
        int n = Integer.parseInt(br.readLine());
        String inputString = br.readLine();
        for (int i = 0; i <n; i++) {
            char inputChar = inputString.charAt(i);
            if('1'<=inputChar&&inputChar<='9'){
                count++;
            } else if (inputChar=='S'){
                stSK.push(inputChar);
            } else if (inputChar=='K') {
                if (!stSK.empty()&&stSK.peek() == 'S') {
                    stSK.pop();
                    count++;
                } else {
                    break;
                }
            } else if (inputChar=='L') {
                stLR.push(inputChar);
            } else if(inputChar=='R'){
                if(!stLR.empty()&&stLR.peek()=='L'){
                    stLR.pop();
                    count++;
                }else{
                    break;
                }
            }
        }
        System.out.println(count);
    }
}