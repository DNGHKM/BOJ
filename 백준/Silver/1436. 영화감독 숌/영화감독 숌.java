import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j =1;
        int count = 0;
        while(count!=n) {
            j++;
            if(Integer.toString(j).contains("666")) {
               count++;
            }
        }
        System.out.println(j);
    }
}