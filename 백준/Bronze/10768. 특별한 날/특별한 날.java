import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int day = sc.nextInt();
        if(mon==2&&day==18){
            System.out.println("Special");
        } else if(mon==1){
            System.out.println("Before");
        } else if(mon==2&&day<18){
            System.out.println("Before");
        } else{
            System.out.println("After");
        }
    }
}