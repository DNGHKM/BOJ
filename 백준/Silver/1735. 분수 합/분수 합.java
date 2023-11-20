import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aSon = Integer.parseInt(st.nextToken());
        int aMom = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int bSon = Integer.parseInt(st.nextToken());
        int bMom = Integer.parseInt(st.nextToken());
        int commonMom = (aMom*bMom)/GCD(aMom,bMom);
        int finalSon = aSon*(commonMom/aMom)+bSon*(commonMom/bMom);
        if(GCD(commonMom,finalSon)!=1) {
            int tmp = GCD(commonMom, finalSon);
            commonMom /= tmp;
            finalSon /= tmp;
        }
        System.out.println(finalSon+" "+commonMom);
    }

    private static int GCD(int a, int b) {
        if(a%b==0){
            return b;
        }else{
            return GCD(b,a%b);
        }
    }
}