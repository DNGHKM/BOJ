import java.util.Arrays;

public class Main {
    static boolean[] self;

    public static void main(String[] args) {
        self = new boolean[10001];
        Arrays.fill(self, true);
        self[0] = false;
        for (int i = 0; i < self.length; i++) {
            if (self[i]) {
                d(i);
            }
        }

        for (int i = 0; i < self.length; i++) {
            if (self[i]) {
                System.out.println(i);
            }
        }
    }

    private static void d(int i) {
        int sum = i;

        while (true) {
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > self.length-1) {
                return;
            }
            self[sum] = false;
            i = sum;
        }
    }
}