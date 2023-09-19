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
        
        //W부터 시작하는 8*8 배열(boardW) 생성
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
        
        //B부터 시작하는 8*8 배열(boardB) 생성
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
        
        //입력 받기
        for (int i = 0; i <n; i++) {
                input[i]=sc.next();
        }
        
        // compare 3차원 배열(시작점이 움직이는 모든 8*8 배열 경우의 수)를 생성
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
        
        //compare배열과 boardW배열을 비교하여 서로 다른 문자의 갯수를 countW 배열에 입력함
        //countW 배열은 각 시작점이 움직이는 모든 8*8배열 경우의수와의 차이를 배열화한 것 
        for (int i = 0; i < compare.length; i++) { 
            for (int j = 0; j < compare[i].length; j++) {
                for (int k = 0; k < compare[i][j].length; k++) {
                    if(compare[i][j][k]!=boardW[j][k]){
                        countW[i]++;
                    }
                }
            }
        }
        
        //compare배열과 boardB배열을 비교하여 서로 다른 문자의 갯수를 countB 배열에 입력함
        //countB 배열은 각 시작점이 움직이는 모든 8*8배열 경우의수와의 차이를 배열화한 것
        for (int i = 0; i < compare.length; i++) {
            for (int j = 0; j < compare[i].length; j++) {
                for (int k = 0; k < compare[i][j].length; k++) {
                    if(compare[i][j][k]!=boardB[j][k]){
                        countB[i]++;
                    }
                }
            }
        }
        Arrays.sort(countW); //countW 배열 오름차순 정렬
        Arrays.sort(countB); //countB 배열 오름차순 정렬
        
        //각 배열의 최솟값끼리 비교하여 총 최솟값 출력
        System.out.println(Math.min(countW[0],countB[0])); 
    }
}