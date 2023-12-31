import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double num = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();
            double result;
            if(unit.equals("kg")){
               result = num*2.2046;
               unit="lb";
            }else if(unit.equals("lb")){
                result=num*0.4536;
                unit="kg";
            }else if(unit.equals("l")){
                result=num*0.2642;
                unit="g";
            }else{
                result=num*3.7854;
                unit="l";
            }
            String s = String.format("%.4f",result);
            bw.write(s+" "+unit+"\n");
        }
        bw.flush();
    }
}