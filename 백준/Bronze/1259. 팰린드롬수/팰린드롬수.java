import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int n = scanner.nextInt();
            int left = 0;
            int right= String.valueOf(n).length();
            if(n==0){
                break;
            }
            for (int i = 0; i < right; i++) {
                if((int)(n/Math.pow(10,left)%10) == (int)(n/Math.pow(10,right-1)%10)){
                    left++;
                    right--;
                }
            }
            if(left>=right){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
        }
    }
}