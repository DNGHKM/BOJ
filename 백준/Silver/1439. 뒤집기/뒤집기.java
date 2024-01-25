import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int countZero = 0;
        int countOne = 0;
        for (int i = 0; i <s.length(); i++) {
            if(i==0) {
                if (s.charAt(i) == '0') {
                    countZero++;
                }else{
                    countOne++;
                }
            }else{
                if(s.charAt(i-1)!=s.charAt(i)){
                    if(s.charAt(i)=='1'){
                        countOne++;
                    }else{
                        countZero++;
                    }
                }
            }
        }
        System.out.println(Math.min(countZero,countOne));
    }
}
