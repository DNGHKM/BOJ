import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 0;
        int m = 0;
        for (int i = 0; i <n; i++) {
            int time = sc.nextInt();
            y+=time/30*10+10;
            m+=time/60*15+15;
        }
        if(y==m){
            System.out.println("Y M "+y);
        }else if(y<m){
            System.out.println("Y "+y);
        }else{
            System.out.println("M "+m);
        }
    }
}