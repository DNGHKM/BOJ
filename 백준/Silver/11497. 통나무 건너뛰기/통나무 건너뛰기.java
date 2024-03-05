import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int max = getMax(arr);
            bw.write(max+"\n");
        }
        bw.flush();
    }

    private static int getMax(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if(j%2==0) list.add(arr[j]);
        }
        for (int j = arr.length-1; j >= 0; j--) {
            if(j%2!=0) list.add(arr[j]);
        }
        int max = 0;
        for (int j = 1; j <list.size(); j++) {
            int num = Math.abs(list.get(j)-list.get(j-1));
            if(num>max) max = num;
        }
        if(max<Math.abs(list.get(0)-list.get(list.size()-1))){
            max = Math.abs(list.get(0)-list.get(list.size()-1));
        }
        return max;
    }
}