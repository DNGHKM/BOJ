import java.util.Arrays;
import java.util.Scanner;

class Main {
    static boolean[] nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int num = sc.nextInt();
            nums = new boolean[10];
            int idx = 1;
            int cur = 0;
            if(num!=0) {
                while (!allTrue()) {
                    cur = num * idx;
                    idx++;
                    String s = String.valueOf(cur);
                    for (int j = 0; j < s.length(); j++) {
                        char c = s.charAt(j);
                        nums[c - '0'] = true;
                    }
                }
                sb.append("Case #" + (i + 1) + ": " + cur + "\n");
            }else{
                sb.append("Case #" + (i + 1) + ": INSOMNIA\n");
            }
        }
        System.out.println(sb+"\n");
    }

    private static boolean allTrue() {
        for (int i = 0; i < nums.length; i++) {
            if (!nums[i]) return false;
        }
        return true;
    }

}