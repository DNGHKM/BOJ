import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        int[] arr = new int[500000];
        int[] dx = {-1, 1, 2};
        int next;
        q.add(n);
        arr[n] = 1;
        while(!q.isEmpty()){
            int tmp = q.poll();
            if(tmp==k) break;
            for (int i = 0; i <3; i++) {
                if(i==2){
                    next = tmp*dx[i];
                }else {
                    next = tmp+dx[i];
                }
                if(next<0||next>200000)continue;
                if(arr[next]==0) {
                    q.add(next);
                    arr[next] = arr[tmp] + 1;
                }
            }
        }
        System.out.println(arr[k]-1);
    }
}