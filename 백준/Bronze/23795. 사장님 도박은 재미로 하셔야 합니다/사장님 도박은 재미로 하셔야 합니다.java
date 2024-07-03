import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true){
            int num = sc.nextInt();
            if(num==-1) break;
            ans += num;
        }
        System.out.print(ans);
    }
}