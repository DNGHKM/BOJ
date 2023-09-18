import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] plan = new int[n];
        int[] behave = new int[n];
        int count =0;
        for (int i = 0; i <n; i++) {
            plan[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            behave[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
            if(behave[i]>=plan[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}