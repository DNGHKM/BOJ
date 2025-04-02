import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int ans = 0;
        //성별, 학년
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            list.add(new int[]{grade, gender});
        }
        int[] arr = new int[5];
        for (int[] ints : list) {
            int grade = ints[0];
            int gender = ints[1];
            if (grade <= 2) {
                arr[0]++;
                continue;
            }
            if (grade <= 4) {
                if (gender == 0) {
                    arr[1]++;
                    continue;
                }
                arr[2]++;
                continue;
            }
            if (gender == 0) {
                arr[3]++;
                continue;
            }
            arr[4]++;
        }
        for (int i : arr) {
            ans += i % k == 0 ? i / k : i / k + 1;
        }
        System.out.println(ans);
    }
}