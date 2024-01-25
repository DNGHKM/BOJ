import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> bags = new ArrayList<>();
        ArrayList<Gem> gems = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            gems.add(new Gem(m, v));
        }
        gems.sort(new Comparator<Gem>() {
            @Override
            public int compare(Gem o1, Gem o2) {
                return o1.weight - o2.weight;
            }
        });
        for (int i = 0; i < k; i++) {
            bags.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(bags);
        long ans = 0;
        int gemIndex = 0;
        PriorityQueue<Gem> pq = new PriorityQueue<>(new Comparator<Gem>() {
            @Override
            public int compare(Gem o1, Gem o2) {
                return o2.price - o1.price;
            }
        });
        for (Integer bag : bags) {
            while (true) {
                if (gemIndex<gems.size()&&gems.get(gemIndex).weight <= bag) {
                    pq.add(gems.get(gemIndex));
                } else {
                    break;
                }
                gemIndex++;
            }
            if (!pq.isEmpty()) ans += pq.poll().price;
        }
        System.out.println(ans);
    }
}
class Gem {
    int weight;
    int price;

    public Gem(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
}