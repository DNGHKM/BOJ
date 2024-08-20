import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[] arr = new int[4];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='A') arr[0]++;
            else if(c=='C') arr[1]++;
            else if(c=='G') arr[2]++;
            else if(c=='T') arr[3]++;
        }
        final int MOD = 1000000007;
        long ans = 1;
        for (int i : arr) {
            ans *= i;
            ans %= MOD;
        }
        System.out.println(ans);
    }
}