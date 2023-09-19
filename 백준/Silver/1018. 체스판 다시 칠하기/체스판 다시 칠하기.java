import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] boardW = new char[8][8];
        char[][] boardB = new char[8][8];
        String[] input = new String[n];
        char[][][] compare = new char[(n-7)*(m-7)][8][8];
        int[] countW=new int[compare.length];
        int[] countB=new int[compare.length];
        for (int i = 0; i <8; i++) {
            for (int j = 0; j <8; j++) {
                if(i%2==0&&j%2==0){
                    boardW[i][j] = 'W';
                } else if(i%2==1&&j%2==0) {
                    boardW[i][j] = 'B';
                } else if(i%2==0&&j%2==1){
                    boardW[i][j] = 'B';
                }else if(i%2==1&&j%2==1){
                    boardW[i][j] = 'W';
                }
            }
        }
        for (int i = 0; i <8; i++) {
            for (int j = 0; j <8; j++) {
                if(i%2==0&&j%2==0){
                    boardB[i][j] = 'B';
                } else if(i%2==1&&j%2==0) {
                    boardB[i][j] = 'W';
                } else if(i%2==0&&j%2==1){
                    boardB[i][j] = 'W';
                }else if(i%2==1&&j%2==1){
                    boardB[i][j] = 'B';
                }
            }
        }
        for (int i = 0; i <n; i++) {
                input[i]=sc.next();
        }
        int a = 0;
        for (int i = 0; i <= n-8 ; i++) {
            for (int j = 0; j <= m-8 ; j++) {
                int b = 0;
                for (int k = i; k <i+8 ; k++) {
                    int c = 0;
                    for (int l = j; l <j+8; l++) {
                        compare[a][b][c]=input[k].charAt(l);
                        c++;
                    }
                    b++;
                }
                a++;
            }
        }
        for (int i = 0; i < compare.length; i++) {
            for (int j = 0; j < compare[i].length; j++) {
                for (int k = 0; k < compare[i][j].length; k++) {
                    if(compare[i][j][k]!=boardW[j][k]){
                        countW[i]++;
                    }
                }
            }
        }
        for (int i = 0; i < compare.length; i++) {
            for (int j = 0; j < compare[i].length; j++) {
                for (int k = 0; k < compare[i][j].length; k++) {
                    if(compare[i][j][k]!=boardB[j][k]){
                        countB[i]++;
                    }
                }
            }
        }
        Arrays.sort(countW);
        Arrays.sort(countB);
        System.out.println(Math.min(countW[0],countB[0]));
    }
}