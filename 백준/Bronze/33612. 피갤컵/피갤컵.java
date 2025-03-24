import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LocalDate date = LocalDate.of(2024, 8, 1);
        LocalDate date1 = date.plusMonths(7L * (n - 1));
        System.out.println(date1.getYear() + " " + date1.getMonthValue());
    }
}