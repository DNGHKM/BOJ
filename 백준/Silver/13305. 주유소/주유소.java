import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<Long> dist = new ArrayList<>();
        ArrayList<Long> price = new ArrayList<>();
        long totalPrice = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n-1 ; i++) {
            dist.add(Long.parseLong(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <n ; i++) {
            price.add(Long.parseLong(st.nextToken()));
        }
        long minPrice = price.get(0);
        for (int i = 0; i <price.size()-1; i++) {
            totalPrice += minPrice*dist.get(i);
            minPrice = Math.min(minPrice,price.get(i+1));
        }
        bw.write(totalPrice+"");
        bw.flush();
    }
}

