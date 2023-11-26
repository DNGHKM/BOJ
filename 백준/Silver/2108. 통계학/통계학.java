import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[i] = input;
            sum += input;
            if(map.containsKey(input)) {
                map.put(input, map.get(input) + 1);
            }else{
                map.put(input, 1);
            }
        }
        int countMax = 0;
        for(int a : map.keySet()){
            if(countMax<map.get(a)){
                countMax=map.get(a);
            }
        }
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        ArrayList<Integer> maxList = new ArrayList<>();
        for (int a : keys) {
            if(map.get(a)==countMax){
                maxList.add(a);
            }
        }
        Collections.sort(maxList);
        Arrays.sort(arr);
        bw.write((Math.round((double) sum/ arr.length))+"\n");
        bw.write(arr[arr.length / 2]+"\n");
        if(maxList.size()>1){
            bw.write(maxList.get(1)+"\n");
        }else{
            bw.write(maxList.get(0)+"\n");
        }
        bw.write(arr[arr.length - 1] - arr[0]+"");
        bw.flush();
    }
}