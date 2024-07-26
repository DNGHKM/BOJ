import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }
        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        int k = max;
        long count = Arrays.stream(arr).filter(i -> i == k).count();
        if (count != 1) {
            System.out.println("?");
            return;
        }
        System.out.println((char) (maxIdx + 'A'));
    }
}