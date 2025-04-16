import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.contains("d2")||s.contains("D2")){
            System.out.println("D2");
            return;
        }
        System.out.println("unrated");
    }
}