import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] boys = new int[3];
        int[] girls = new int[3];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            boys[i] = Integer.parseInt(st.nextToken());
            girls[i] = Integer.parseInt(st.nextToken());
        }
        boolean success = false;
        for (int i = Math.max(0, boys[0] - girls[2]); i <= Math.min(girls[1], boys[0]); i++) {
            sb = new StringBuilder();
            sb.append(1).append("\n");
            int[] tmpBoys = boys.clone();
            int[] tmpGirls = girls.clone();
            findCouple(tmpBoys, i, tmpGirls);
            if (Arrays.stream(tmpBoys).sum() == 0 && Arrays.stream(tmpGirls).sum() == 0) {
                success = true;
                break;
            }
        }
        if(success){
            System.out.println(sb);
        }else{
            System.out.println(0);
        }
    }

    private static void findCouple(int[] boys, int i, int[] girls) {
        boys[0] -= i;
        girls[1] -= i;
        sb.append(i).append(" ");

        int num = Math.min(boys[0], girls[2]);
        boys[0] -= num;
        girls[2] -= num;
        sb.append(num).append("\n");

        num = Math.min(boys[1], girls[0]);
        boys[1] -= num;
        girls[0] -= num;
        sb.append(num).append(" ");

        num = Math.min(boys[1], girls[2]);
        boys[1] -= num;
        girls[2] -= num;
        sb.append(num).append("\n");

        num = Math.min(boys[2], girls[0]);
        boys[2] -= num;
        girls[0] -= num;
        sb.append(num).append(" ");

        num = Math.min(boys[2], girls[1]);
        boys[2] -= num;
        girls[1] -= num;
        sb.append(num).append("\n");
    }
}
