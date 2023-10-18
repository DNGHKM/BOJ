import java.io.*;

public class Main {//2742번
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        if(n<10) n=n*10;
        int result=n%10;
        int count =0;
        int ten = n/10;
        int one = n%10;
        if(n==0) {
            System.out.println(1);
            return;
        }
        while(result !=n){
            result=result%10*10+(ten+one)%10;
            ten = result/10;
            one = result%10;
            count++;
        }
        System.out.println(count);
    }
}