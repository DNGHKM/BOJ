import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.println(0);
            return;
        }
        ArrayList<Integer> primeList = new ArrayList<>();
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            for (int j = i + i; j < isPrime.length; j += i) {
                isPrime[j] = false;
            }
        }
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) primeList.add(i);
        }
        int count = 0;
        int sum = 2;
        int left = 0;
        int right = 0;
        while (primeList.get(right) <= n) {
            if (sum == n) {
                count++;
            } else if (sum > n) {
                sum -= primeList.get(left);
                left++;
                continue;
            }
            right++;
            if(primeList.size()<=right) {
                break;
            }
            sum += primeList.get(right);
        }
        System.out.println(count);
    }
}