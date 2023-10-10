import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        //2차원 배열 정렬을 위해 추가 조건 제시
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0]-o2[0];
                }else{
                    return o1[1]-o2[1];
                }
            }
        });
        for (int[] ints : arr) {
            str.append(ints[0]).append(" ").append(ints[1]).append("\n");
        }
        System.out.println(str);
    }
}
