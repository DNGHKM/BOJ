import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int input = Integer.parseInt(br.readLine());
        if(input>=3600){
            h += input/3600;
            m += input%3600/60;
            s += input%3600%60%60;
        }else if(60<=input){
            m+= input/60;
            s+= input%60;
        }else{
            s+= input;
        }
        if(s>=60){
            m++;
            s-=60;
        }
        if (m >= 60) {
            h++;
            m-=60;
        }
        if(h>=24){
            h%=24;
        }
        bw.write(h+" "+m+" "+s);
        bw.flush();
    }
}