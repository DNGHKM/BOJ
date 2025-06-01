import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for (int i = 0; i < 6; i++) {
            if(sc.nextLine().equals("W")){
                cnt++;
            }
        }
        if(cnt>=5){
            System.out.println(1);
            return;
        }
        if(cnt>=3){
            System.out.println(2);
            return;
        }
        if(cnt>=1){
            System.out.println(3);
            return;
        }
        System.out.println(-1);
    }
}
