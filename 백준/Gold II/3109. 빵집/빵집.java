import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, 1, 1};
    static int[] dy = {1, 0, -1};
    static int r, c;
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int count = 0;
        arr = new char[r][c];
        for (int i = 0; i < r; i++) {
            String input = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.charAt(j);
            }
        }
        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < r; i++) {
            if(arr[i][0]=='.'){
                stack.push(new int[]{i,0});
                arr[i][0] = '1';
            }
            while(!stack.isEmpty()){
                int[] current = stack.pop();
                arr[current[0]][current[1]] = '1';
                if(current[1]==c-1){
                    arr[current[0]][current[1]]='1';
                    stack.clear();
                    break;
                }
                for (int j = 0; j <3; j++) {
                    int[] next = {current[0]+dy[j],current[1]+dx[j]};
                    if(rangeCheck(next)) {
                        if (arr[next[0]][next[1]] == '.') {
                            stack.push(new int[]{next[0], next[1]});
                        }
                    }
                }
            }
        }
        for (int j = 0; j <r; j++) {
            if(arr[j][c-1]=='1'){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean rangeCheck(int[] next) {
        return 0 <= next[0] && next[0] < r && next[1] < c;
    }
}