import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int nDouble = n*2;
        boolean result = false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <=Math.sqrt(nDouble); i++) {
            if(nDouble%i==0){
                list.add(i);
                list.add(nDouble/i);
            }
        }
        list.add(nDouble);
        Collections.sort(list);
        for (int a : list) {
           double first = (double) (nDouble-a*a+a)/(2*a);
            if(l<=a&&a<=100&&!result&&first>=0&&first*10%10==0){
                for (int j = 0; j <a; j++) {
                    bw.write((int)first+" ");
                    first++;
                    result = true;
                }
            }
        }
        if(result) {
            bw.flush();
        }else{
            bw.write(-1+"");
            bw.flush();
        }
    }
}