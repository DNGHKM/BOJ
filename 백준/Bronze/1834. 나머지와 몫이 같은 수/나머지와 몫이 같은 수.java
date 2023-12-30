import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        int i=0;
        while (i<n) {
            sum+= (long) n *i+i;
            i++;
        }
        System.out.println(sum);
    }
}