import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashSet<Integer> hs = new HashSet<>();
        StringBuffer result = new StringBuffer();
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        for (int i = 0; i < n; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
            hs.add(arr[i]);
        }
        Integer[] tmpArr = hs.toArray(new Integer[0]);
        Arrays.sort(tmpArr);
        for (int i = 0; i <arr.length; i++) {
            int num=Arrays.binarySearch(tmpArr,arr[i]);
                result.append(num).append(" ");
            }
        System.out.println(result);
    }
}