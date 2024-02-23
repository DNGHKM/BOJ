import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.add(i+1);
        }
        while(!q.isEmpty()){
            if(q.size()==1){
                sb.append(q.poll());
                break;
            }
            for (int i = 0; i < k-1; i++) {
                q.add(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }
        sb.append(">");
        System.out.print(sb);
    }
}