import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        boolean[] result = new boolean[n];
        int count =0;
        for (int i = 0, j=0; i < n; i++, j++) {
            str[i] = sc.next();
            result[i] = true;
        }
        char[][] a = new char[n][];
        for (int i = 0; i <n; i++) {
            a[i]=str[i].toCharArray();
            for (int j = 0; j <a[i].length-1; j++) {
                if(a[i][j]==a[i][j+1]){
                    a[i][j]='0';
                }
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <a[i].length-1; j++) {
                for (int k = j+1; k < a[i].length; k++) {
                    if(a[i][j]==a[i][k]){
                        if(a[i][j]=='0'){
                            continue;
                        }
                        result[i] = false;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < result.length; i++) {
            if(result[i]==true){
                count++;
            }
        }
        System.out.println(count);
    }
}