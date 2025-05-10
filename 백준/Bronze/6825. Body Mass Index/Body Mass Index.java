import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double bmi = w / (h * h);
        if(bmi>=25){
            System.out.println("Overweight");
            return;
        }
        if (bmi >= 18.5) {
            System.out.println("Normal weight");
            return;
        }
        System.out.println("Underweight");
    }
}