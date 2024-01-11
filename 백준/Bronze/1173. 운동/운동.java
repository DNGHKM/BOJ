import java.util.Scanner;
public class Main {
    static int N, m, T, R, heart, time, exe;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    m = sc.nextInt();
    int M = sc.nextInt();
    T = sc.nextInt();
    R = sc.nextInt();
    time = 0;
    exe =0;
    heart = m;
    while(exe< N){
        if(M-m<T){
            System.out.println(-1);
            return;
        }
        if(heart+T<=M){
            exercise();
        }else{
            rest();
        }
    }
        System.out.println(time);
    }
    static void exercise(){
        time++;
        exe++;
        heart+=T;
    }
    static void rest(){
        time++;
        heart-=R;
        if(heart<m){
            heart = m;
        }
    }
}