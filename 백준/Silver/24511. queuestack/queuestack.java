import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] structure = new int[n];
        for (int i = 0; i <n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            structure[i] = tmp;
        }
        ArrayList<Integer> input = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int a : structure){
            int inputNum = Integer.parseInt(st.nextToken());
            if(a==0){
                input.add(inputNum);
            }
        }
        ArrayList<Integer> input2 = new ArrayList<>();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            input2.add(Integer.parseInt(st.nextToken()));
        }
        if(m<=input.size()){
            for (int i = input.size()-1; i >= input.size()-m ; i--) {
                bw.write(input.get(i)+" ");
            }
        }else{
            for (int i = input.size()-1; i >= 0 ; i--) {
                bw.write(input.get(i)+" ");
            }
            for (int i = 0; i <m-input.size(); i++) {
                bw.write(input2.get(i)+" ");
            }
        }
        bw.flush();
    }
}