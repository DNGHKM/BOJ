import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int bitset = 0;
        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            int num = 0;
            if(!input.equals("all")&&!input.equals("empty")){
                num = Integer.parseInt(st.nextToken());
            }
            if(input.equals("add")){
                bitset |= (1<<num-1);
            }else if(input.equals("remove")){
                bitset &= ~(1<<num-1);
            }else if(input.equals("check")){
                if((bitset&(1<<num-1))!=0){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }else if(input.equals("toggle")){
                bitset^=(1<<num-1);
            }else if(input.equals("all")){
                bitset|=~0;
            }else{
                bitset&=0;
            }
        }
        bw.flush();
    }
}