import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
            list.get(i).add(n);
            list.get(i).add(i);
        }
        int maxSize = 0;
        int maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            int num = 0;
            int idx = 1;
            while (num >=0){
                num = list.get(i).get(idx - 1) - list.get(i).get(idx);
                list.get(i).add(num);
                idx++;
                if(maxSize<idx){
                    maxSize = idx;
                    maxIndex = i;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(list.get(maxIndex).size()-1 + "\n");
        for (Integer i : list.get(maxIndex)) {
            if(i>=0) sb.append(i + " ");
        }
        System.out.println(sb);
    }
}