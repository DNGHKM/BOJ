import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int k = sc.nextInt();
        while(rest(n)>k){
            n++;
            ans++;
        }
        System.out.print(ans);
    }
    static int rest(int n) {
        int cnt = 0;
        while(n>0){
            cnt+=n%2;
            n/=2;
        }
        return cnt;
    }
}