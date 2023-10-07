import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2666800];
        int j =1;
        for (int i = 0; i <arr.length; i++) {
            if(Integer.toString(i).contains("666")) {
                arr[j] = i;
                j++;
            }
        }
        System.out.println(arr[n]);
    }
}