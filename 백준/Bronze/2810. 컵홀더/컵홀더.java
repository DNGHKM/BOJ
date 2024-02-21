import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 1;
        int l = 0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)=='S') c++;
            else l++;
        }
        c+=l/2;
        if(n<c) c=n;
        System.out.print(c);
    }
}