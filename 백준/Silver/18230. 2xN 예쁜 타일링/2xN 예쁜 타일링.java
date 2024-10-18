import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int one = Integer.parseInt(st.nextToken());
        int two = Integer.parseInt(st.nextToken());
        int[] oneArr = new int[one];
        int[] twoArr = new int[two];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < one; i++) {
            oneArr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < two; i++) {
            twoArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(oneArr);
        Arrays.sort(twoArr);
        long twoNeed = n / 2;
        long oneNeed = n % 2;
        while (twoNeed > two) {
            twoNeed--;
            oneNeed += 2;
        }
        long ans = -1;
        while (twoNeed >= 0 && oneNeed <= one && twoNeed <= two) {
            long sum = 0;
            int oneIdx = oneArr.length - 1;
            int twoIdx = twoArr.length - 1;

            for (int i = 0; i < oneNeed; i++) {
                sum += oneArr[oneIdx];
                oneIdx--;
            }

            for (int i = 0; i < twoNeed; i++) {
                sum += twoArr[twoIdx];
                twoIdx--;
            }
            oneNeed += 2;
            twoNeed--;
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
}