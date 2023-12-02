import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int a1 = a/100*100;
        int b = Integer.parseInt(br.readLine());
        while(a1%b!=0){
            a1++;
        }
        int result = a1-a1/100*100;
        if(result>9){
            System.out.println(result);
        }else{
            System.out.println("0"+result);
        }
    }
}