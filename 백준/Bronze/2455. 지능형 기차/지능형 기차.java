import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current=0;
        int max = 0;
        for (int i = 0; i <4; i++) {
            int out = sc.nextInt();
            int in = sc.nextInt();
            current+=in-out;
            if(current>10000){
                current = 10000;
            }
            if(max<current){
                max = current;
            }
        }
        System.out.println(max);
    }
}