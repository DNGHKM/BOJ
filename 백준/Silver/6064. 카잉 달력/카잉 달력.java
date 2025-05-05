import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            sb.append(findYear(m, n, x, y) + "\n");
        }
        System.out.println(sb);
    }

    private static int findYear(int m, int n, int x, int y) {
        int max = m * n / findGCD(m, n);
        Set<Integer> setA = new HashSet<>();
        int numX = x;
        while (numX <= max) {
            setA.add(numX);
            numX += m;
        }
        int numY = y;
        while (numY <= max) {
            if(setA.contains(numY)){
                return numY;
            }
            numY += n;
        }
        return -1;
    }
    
    private static int findGCD(int m, int n) {
        if (m % n == 0) {
            return n;
        }
        return findGCD(n, m % n);
    }
}