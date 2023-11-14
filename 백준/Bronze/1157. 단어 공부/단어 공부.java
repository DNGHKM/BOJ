import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] c = new char[input.length()];
        int[][] count = new int[26][2];
        int rightMax = 0;
        int rightAddress = 0;
        int leftMax = 0;
        int leftAddress = 0;
        for (int i = 0; i < input.length(); i++) {
            c[i] = input.charAt(i);
            if('a'<=c[i]&&c[i]<='z'){
                c[i]-=32;
            }
        }
        for (int i = 0; i < 26; i++) {
            count[i][0] = i+65;
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < 26; j++) {
                if(c[i]==j+65){
                    count[j][1]+=1;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
                if(rightMax < count[i][1]){
                    rightMax = count[i][1];
                    rightAddress = i;
                }
            }
        for (int i = 25; i >=0; i--) {
                if(leftMax < count[i][1]){
                    leftMax = count[i][1];
                    leftAddress = i;
                }
            }
        if (rightAddress==leftAddress){
            char result = (char) (rightAddress+65);
            System.out.println(result);
        } else{
            System.out.println("?");
        }
    }
}