import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] alphabet = new int[26];
        int count = 0;
        int oddIndex=-1;
        for (int i = 0; i <str.length(); i++) {
            alphabet[str.charAt(i)-'A']++;
        }
        for (int i = 0; i <alphabet.length; i++) {
            if(alphabet[i]%2==1){
                count++;
                oddIndex=i;
            }
        }
        if(count>1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <alphabet.length; i++) {
            int tmp = alphabet[i];
            for (int j = 0; j < tmp / 2; j++) {
                sb.append((char) (i + 'A'));
                alphabet[i]--;
            }
        }
        if(oddIndex!=-1) sb.append((char) (oddIndex + 'A'));
        if(sb.charAt(sb.length()-1)!=(char)(oddIndex+'A')){
            for (int i = sb.length()-1; i >=0 ; i--) {
                sb.append(sb.charAt(i));
            }
        }else{
            for (int i = sb.length()-2; i >=0 ; i--) {
                sb.append(sb.charAt(i));
            }
        }
        System.out.print(sb);
    }
}
