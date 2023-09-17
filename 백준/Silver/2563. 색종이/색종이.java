import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b;
        int[][] white = new int[100][100];
        int[][] black = new int[n][2];
        int count = 0;
        for (int i = 0; i <n; i++) {
            a=sc.nextInt();
            b=sc.nextInt();
            black[i][0]=a;
            black[i][1]=b;
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                white[i][j] =0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = black[i][0]-1; j <black[i][0]+9; j++) {
                for (int k = black[i][1]-1; k < black[i][1]+9; k++) {
                    white[k][j]=1;
                }
            }
        }
        for (int i = 0; i <100; i++) {
            for (int j = 0; j <100; j++) {
                if(white[i][j]==1){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}