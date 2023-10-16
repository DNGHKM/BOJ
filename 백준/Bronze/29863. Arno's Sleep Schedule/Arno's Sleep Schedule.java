import java.util.Scanner;
public class Main { //29863번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int finish = sc.nextInt();
        if(start>=20){
            System.out.println(24-start+finish);
        } else{
            System.out.println(finish-start);
        }
    }
}