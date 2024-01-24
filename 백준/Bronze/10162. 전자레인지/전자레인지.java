import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int t = sc.nextInt();
        int[] count = new int[3];
        int[] time = {300, 60, 10};
        for (int i = 0; i <3; i++) {
            count[i] = t/time[i];
            t-=count[i]*time[i];
        }
        if(t==0){
            for (int i : count) {
                sb.append(i).append(" ");
            }
            System.out.println(sb);
        }else{
            System.out.println(-1);
        }
    }
}