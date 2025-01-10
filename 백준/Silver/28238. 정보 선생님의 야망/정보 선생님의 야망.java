import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = {3, 5, 6, 9, 10, 12, 17, 18, 20, 24};
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine().replaceAll(" ", ""), 2);
        }
        int[] allCnt = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = 0; j < input.length; j++) {
                if ((nums[i] & input[j]) == nums[i]) {
                    cnt++;
                }
            }
            allCnt[i] = cnt;
        }
        int max = -1;
        int maxIdx = -1;
        for (int i = 0; i < allCnt.length; i++) {
            if (max < allCnt[i]) {
                max = allCnt[i];
                maxIdx = i;
            }
        }
        String binaryString = String.format("%5s", Integer.toBinaryString(nums[maxIdx])).replace(' ', '0');
        String ans = String.join(" ", binaryString.split(""));
        System.out.println(max + "\n" + ans);
    }
}
