import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <=n; i++) {
            q.add(i);
        }
        int i =1;
        while(!q.isEmpty()) {
                if (i % k == 0) {
                    result.append(q.poll()).append(", ");
                } else {
                    int tmp = q.poll();
                    q.add(tmp);
                }
                i++;
        }
        result.delete(result.length()-2,result.length());
        System.out.println("<"+result+">");
    }
}