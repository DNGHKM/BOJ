import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals("NLCS")){
            System.out.println("North London Collegiate School");
        }else if(s.equals("BHA")){
            System.out.println("Branksome Hall Asia");
        }else if(s.equals("KIS")){
            System.out.println("Korea International School");
        }else if(s.equals("SJA")){
            System.out.println("St. Johnsbury Academy");
        }
    }
}