import java.io.*;

public class Main {
    static int[] arr;
    static boolean accident;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        accident = false;
        arr = new int[g+1];
        for (int i = 0; i <=g; i++) {
            arr[i] = i;
        }
        int ans =0;
        for (int i = 0; i <p; i++) {
            int num = Integer.parseInt(br.readLine());
            deep(num);
            if(accident) {
                System.out.print(ans);
                return;
            }
            ans++;
        }
        System.out.println(p);
    }
    private static int deep(int num) {
        if(arr[num]==0) accident = true;
        if(arr[num]==num) {
            return arr[num]--;
        }
        return arr[num] = deep(arr[num]);
    }
}