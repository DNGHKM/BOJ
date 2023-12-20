import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        double x = Math.sqrt((double) (d * d) /(h*h+w*w));
        System.out.println((int)(h*x)+" "+(int)(w*x));
    }
}