import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vacation = sc.nextInt();
        int kor = sc.nextInt();
        int math = sc.nextInt();
        int korPerDay = sc.nextInt();
        int mathPerDay = sc.nextInt();
        int korDay;
        int mathDay;
        if(kor%korPerDay==0){
            korDay = kor/korPerDay;
        } else{
            korDay = kor/korPerDay+1;
        }
        if(math%mathPerDay==0){
            mathDay = math/mathPerDay;
        } else{
            mathDay = math/mathPerDay+1;
        }
        System.out.println(vacation-Math.max(korDay,mathDay));
    }
}