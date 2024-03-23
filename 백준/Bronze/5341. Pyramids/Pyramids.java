import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            sb.append((1+num)*num/2+"\n");
        }
        System.out.println(sb);
    }
}