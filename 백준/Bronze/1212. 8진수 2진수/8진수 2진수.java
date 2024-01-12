import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= str.length()-1; i++) {
            sb.append(binary(str.charAt(i)));
        }
        String ans = sb.toString();
        while(true) {
            if(str.equals("0")) {
                System.out.println(0);
                return;
            }
            if(ans.charAt(0)=='0'){
                ans = ans.substring(1);
            }else{
                break;
            }
        }
        System.out.println(ans);
    }
    private static String binary(char c) {
        StringBuilder result = new StringBuilder(Integer.toBinaryString(c-'0'));
        while(result.length()<3){
            result.insert(0, '0');
        }
        return result.toString();
    }
}