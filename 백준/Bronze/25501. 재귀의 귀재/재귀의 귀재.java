import java.util.Scanner;

public class Main{
    public static int[] recursion(String s, int l, int r, int deep){
        if(l >= r) return new int[]{1,deep};
        else if(s.charAt(l) != s.charAt(r)) return new int[]{0,deep};
        else return recursion(s, l+1, r-1, deep+1);
    }
    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1,1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            String input = sc.next();
            int[] result = isPalindrome(input);
            sb.append(result[0] + " " + result[1]+"\n");
        }
        System.out.println(sb);
    }
}