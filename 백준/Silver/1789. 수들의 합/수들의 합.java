import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long i = 1;
        while(true){
            if(i*(i+1)/2<=s) {
                i++;
            }else{
                break;
            }
        }
        System.out.println(i-1);
    }
}
