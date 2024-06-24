import java.io.*;
import java.util.*;

public class Main {
    static long point;
    static ArrayList<PriorityQueue<Integer>> pqList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        pqList = new ArrayList<>();
        for (int i = 0; i <= 11; i++) {
            pqList.add(new PriorityQueue<>(Collections.reverseOrder()));
        }
        point = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            pqList.get(num).add(price);
        }
        for (PriorityQueue<Integer> price : pqList) {
            if(!price.isEmpty()) {
                point += price.peek();
            }
        }
        for (int i = 0; i < k; i++) {
            minusPoint();
        }
        System.out.println(point);
    }
    static void minusPoint() {
        point = 0;
        for (PriorityQueue<Integer> price : pqList) {
            if (!price.isEmpty()) {
                price.add(price.poll() - 1);
                point += price.peek();
            }
        }
    }
}
