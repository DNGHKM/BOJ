import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i <t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] score = new int[n];
            int min = n;
            for (int j = 0; j <n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int scoreA = Integer.parseInt(st.nextToken());
                int scoreB = Integer.parseInt(st.nextToken());
                score[scoreA-1] = scoreB-1;
            }
            int count = n;
            for (int j = 1; j <score.length; j++) {
                if(score[j-1]<min) min = score[j-1];
                if(score[j]>min) count--;
            }
            bw.write(count+"\n");
        }
        bw.flush();
    }
}