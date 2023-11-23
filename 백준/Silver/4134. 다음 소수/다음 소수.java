import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            long t = Long.parseLong(br.readLine());
            boolean isPrime = false;
            while(!isPrime) {
                if(t<=2){
                    bw.write(2+"\n");
                    break;
                } else if(t==3){
                    bw.write(3+"\n");
                    break;
                }
                for (int j = 2; j <= Math.sqrt(t); j++) {
                    if (t % j == 0) {
                        if(t%2==0){
                            t++;
                        }else{
                            t+=2;
                        }
                        break;
                    }
                    if(j==(int)Math.sqrt(t)){
                        isPrime = true;
                    }
                }
            }
            if(isPrime) bw.write(t+"\n");
        }
        bw.flush();
    }
}