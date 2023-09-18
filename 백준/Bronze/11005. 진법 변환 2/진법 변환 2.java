import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        String result = "";
        String answer = "";
        while(n>=b){
            if(n%b>9){
                result+=(char)(n%b+55);
            } else {
                result += n % b;
            }
            n/=b;
        }
        if(n<b){
            if(n>9){
                result+=(char)(n%b+55);
            } else {
                result += n % b;
            }
        }
        for (int i = result.length()-1; i >= 0; i--) {
            answer += result.charAt(i);
        }
        System.out.println(answer);
    }
}