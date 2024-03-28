import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<HashSet<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new HashSet<>());
        }
        int[][] arr = new int[n][5];
        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i <5; i++) {
            for (int j = 0; j <arr.length; j++) {
                for (int k = j+1; k <arr.length; k++) {
                    if(arr[j][i]==arr[k][i]){
                        list.get(j).add(k);
                        list.get(k).add(j);
                    }
                }
            }
        }
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> integers = list.get(i);
            if(integers.size()>max){
                max= integers.size();
                maxIndex = i;
            }
        }
        System.out.println(maxIndex+1);
    }
}