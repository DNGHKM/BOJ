import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<int[]> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            list.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }
        list.sort((o1, o2) -> {
            if (o1[1] != o2[1]) {
                return o2[1] - o1[1];
            } else {
                return o1[0] - o2[0];
            }
        });
        ArrayList<Deque<int[]>> dequeList = new ArrayList<>();
        int arrayIndex = -1;
        int curSize = -1;
        for (int[] ints : list) {
            if (ints[1] != curSize) {
                dequeList.add(new LinkedList<>());
                curSize = ints[1];
                arrayIndex++;
            }
            dequeList.get(arrayIndex).add(new int[]{ints[0], ints[1]});
        }
        int count = 0;
        int idx = 0;
        boolean reverse = false;
        while (count < m) {
            Deque<int[]> curDeque = dequeList.get(idx);
            while(curDeque.isEmpty()) {
                idx++;
                curDeque = dequeList.get(idx);
            }
            int[] poll = reverse ? curDeque.pollLast() : curDeque.pollFirst();
            int num = poll[0];
            int size = poll[1];
            bw.write(num + "\n");
            count++;
            if (size % 7 == 0) {
                reverse = !reverse;
            }
        }
        bw.flush();
    }
}