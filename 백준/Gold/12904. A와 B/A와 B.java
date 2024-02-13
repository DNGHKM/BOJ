import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        StringBuilder sb = new StringBuilder(t);
        while(s.length()<sb.length()){
            if(sb.charAt(sb.length()-1)=='A'){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.deleteCharAt(sb.length()-1);
                sb.reverse();
            }
        }
        t = sb.toString();
        if(s.equals(t)){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}