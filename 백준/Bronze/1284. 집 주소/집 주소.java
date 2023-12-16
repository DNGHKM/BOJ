import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            int input = Integer.parseInt(br.readLine());
            if(input==0) break;
            int width = 2;
            int length = 0;
            int tmp = input;
            for (int i = 0; i <4; i++) {
                if(1<=tmp&&tmp<10) {
                    length = i+1;
                    break;
                }
                tmp/=10;
            }
            width+=length-1;
            for (int i = 0; i <length; i++) {
                int num = input%10;
                if(num==1){
                    width+=2;
                } else if(num==0){
                    width+=4;
                }else{
                    width+=3;
                }
                input/=10;
            }
            sb.append(width).append("\n");
        }
        System.out.println(sb);
    }
}
