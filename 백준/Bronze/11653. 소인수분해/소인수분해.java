import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int j=0;
        int i=2;
        while(n!=1){
            if(n%i==0){
                n=n/i;
                arr[j]=i;
                j++;
            }else {
                i++;
            }
        }
        for(int a : arr){
            if(a!=0) {
                System.out.println(a);
            }
        }
    }
}