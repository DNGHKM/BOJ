import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i <3; i++) {
            input[i] = sc.nextInt();
        }
        Arrays.sort(input);
        if(input[0]+input[1]>input[2]){
            System.out.println(input[0]+input[1]+input[2]);
        } else if (input[0]==input[1]&&input[1]==input[2]) {
            System.out.println(input[0]*3);
        } else{
            System.out.println(2*(input[0]+input[1])-1);
        }
    }
}