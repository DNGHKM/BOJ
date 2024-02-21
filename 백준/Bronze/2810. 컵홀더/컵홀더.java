import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int cup = 1;
        int l = 0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='S') {
                cup++;
            }else{
                l++;
            }
        }
        System.out.print(Math.min(n,cup+(l/2)));
    }
}