import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int target = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<>();
        if (n!=0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                arr.add(st.nextToken());
            }
        }
        int upDownMin = Math.abs(target-100);
        int upDownStart=100;
        int range;
        if(target<=100){
            range=100;
        }else{
            range = target*2;
        }
        for (int i = 0; i <range; i++) {
            boolean check = true;
            for (String s : arr) {
                if ((i + "").contains(s)) {
                    check = false;
                    break;
                }
            }
            if (check&&Math.abs(i-target)< upDownMin) {
                upDownMin = Math.abs(i-target);
                upDownStart = i;
            }
        }
        int numCount = (upDownStart+"").length();
        bw.write(Math.min(numCount+upDownMin,Math.abs(target-100))+"");
        bw.flush();
    }
}