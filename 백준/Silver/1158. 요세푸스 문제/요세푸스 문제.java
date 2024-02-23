import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");
        LinkedList<Integer> list = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }
        int index = 0;
        for (int i = 0; i <n; i++) {
            if(list.size()==1){
                bw.write(list.get(0)+"");
                break;
            }
            index+=k-1;
            while(index>=list.size()){
                index-=list.size();
            }
            bw.write(list.get(index)+", ");
            list.remove(index);
        }
        bw.write(">");
        bw.flush();
    }
}