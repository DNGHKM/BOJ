import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Stack<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(new Stack<>());
        }
        for (int i = 0; i <n; i++) {
            int num = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 4; j++) {
                Stack<Integer> currentStack = list.get(j);
                if(currentStack.isEmpty()){
                    currentStack.push(num);
                    break;
                }else{
                    if(currentStack.peek()<num) {
                        currentStack.push(num);
                        break;
                    }
                }
                if(j==3){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}