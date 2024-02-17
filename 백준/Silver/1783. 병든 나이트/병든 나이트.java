import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans;
        if(n>=3){
            if(m>=7) {
                ans = m - 2;
            }else if(5<=m){ //여기서 문제..? 3/5
                ans = 4;
            }else{
                ans = m;
            }
        }else if(n==1){
            ans = 1;
        }else{
            if(m<3){
                ans = 1;
            }else if(m<5){
                ans = 2;
            }else if(m<7){
                ans = 3;
            }else{
                ans = 4;
            }
        }
        System.out.print(ans);
    }
}