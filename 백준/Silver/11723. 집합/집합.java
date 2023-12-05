import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            int num = 0;
            if(!input.equals("all")&&!input.equals("empty")){
                num = Integer.parseInt(st.nextToken());
            }
            if(input.equals("add")){
                set.add(num);
            }else if(input.equals("remove")){
                set.remove(num);
            }else if(input.equals("check")){
                if(set.contains(num)){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }else if(input.equals("toggle")){
                if(set.contains(num)){
                    set.remove(num);
                }else{
                    set.add(num);
                }
            }else if(input.equals("all")){
                set.clear();
                for (int j = 1; j <=20; j++) {
                    set.add(j);
                }
            }else{
                set.clear();
            }
        }
        bw.flush();
    }
}