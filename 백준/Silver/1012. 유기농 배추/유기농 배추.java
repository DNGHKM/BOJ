import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[][] farm;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int m;
    static int n;
    static int currentX;
    static int currentY;
    static class Node{
        int x;
        int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i <t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            farm = new int[m][n];
            for (int j = 0; j <k; j++) {
                st = new StringTokenizer(br.readLine());
                int m1 = Integer.parseInt(st.nextToken());
                int n1 = Integer.parseInt(st.nextToken());
                farm[m1][n1]=1;
            }
            int count=0;
            for (int j = 0; j <m; j++) {
                for (int l = 0; l <n; l++) {
                    if(farm[j][l]==1){
                        DFS(j, l);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    private static void DFS(int a, int b) {
        Stack<Node> stack = new Stack<>();
        if(farm[a][b]==1) stack.push(new Node(a,b));
        farm[a][b] =0;
        while(!stack.isEmpty()){
            Node node = stack.pop();
            for (int i = 0; i <4; i++) {
                currentX = node.x+dx[i];
                currentY = node.y+dy[i];
                if(RangeCheck()&& farm[currentX][currentY]!=0) {
                    farm[currentX][currentY]=0;
                    stack.push(new Node(currentX, currentY));
                }
            }
        }
    }
    private static boolean RangeCheck() {
    return  (0<=currentX && currentX<m&& 0<=currentY && currentY<n);
    }
}