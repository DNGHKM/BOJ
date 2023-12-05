import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i <num; i++) {
            Queue<Integer> q = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <n; j++) {
                int tmpNum = Integer.parseInt(st.nextToken());
                q.add(tmpNum);
                list.add(tmpNum);
            }
            Collections.sort(list);
            int count = 0;
            while(m!=-1){
                int tmp = q.poll();
                if(tmp==list.get(list.size()-1)){
                    m--;
                    count++;
                    list.remove(list.size()-1);
                }else if(m==0&&tmp!=list.get(list.size()-1)){
                    q.add(tmp);
                    m=q.size()-1;
                } else{
                    q.add(tmp);
                    m--;
                }
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }
}