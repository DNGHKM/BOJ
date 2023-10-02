import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] score = new float[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        float max = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
        }
        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] / max * 100;
        }
        for (int i = 0; i < score.length; i++) {
            sum = sum + score[i];
        }
        System.out.println(sum/score.length);
        }
}