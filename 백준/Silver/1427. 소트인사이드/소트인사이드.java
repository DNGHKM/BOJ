import java.io.*;
import java.util.*;

public class Main { //선택정렬 이용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> al = new ArrayList<>();
        String n = br.readLine();
        for (int i = 0; i <n.length(); i++) {
            al.add((int)n.charAt(i));
        }
        for (int i = 0; i <al.size(); i++) {
            int maxIndex =0;
            int max = 0;
            for (int j = i; j <al.size(); j++) {
                if(al.get(j)>max){
                    max=al.get(j);
                    maxIndex = j;
                }
            }
            al.set(maxIndex,al.get(i));
            al.set(i,max);
        }
        for(int i : al){
            bw.write(i);
        }
        bw.flush();
        bw.close();
    }
}