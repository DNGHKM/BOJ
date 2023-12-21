import java.util.*;

class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    int num = 0;
    for (int i = 0; i <input.length(); i++) {
        char c = input.charAt(i);
        if('a'<=c&&c<='z'){
            num+=c-'a'+1;
        }else{
            num+=c-'A'+27;
        }
    }
        for (int i = 2; i <num; i++) {
            if(num%i==0){
                System.out.println("It is not a prime word.");
                return;
            }
        }
        System.out.println("It is a prime word.");
    }
}