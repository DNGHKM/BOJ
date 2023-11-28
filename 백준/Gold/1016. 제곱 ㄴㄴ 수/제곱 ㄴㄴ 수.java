import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
        int[] arr = new int[(int) Math.sqrt(max)+1];
        ArrayList<Integer> primeList = new ArrayList<>();
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <Math.sqrt((int) (max-min+1)); i++) {
            for (int j = i+i; j <(int) Math.sqrt(max-min+1); j+=i) {
                if(j%i==0){
                    arr[j] = 0;
                }
            }
        }
        for(int i =0; i<arr.length; i++){
            if(arr[i]!=0){
                primeList.add(i);
            }
        }
        boolean[] result = new boolean[(int) (max-min+1)];
        Arrays.fill(result, true);
        long count = max-min+1;

        for (long a : primeList) {
            long s = a * a;
            long start;
            if(min%s == 0){
                start = min/s;
            } else{
                start = min/s+1;
            }
            for (long i = start; i*s<=max; i++) {
                result[(int) ((i*s)-min)] = false;
            }
        }
        for (int i = 0; i < result.length; i++) {
            if(!result[i]){
                count--;
            }
        }
        System.out.println(count);
    }
}