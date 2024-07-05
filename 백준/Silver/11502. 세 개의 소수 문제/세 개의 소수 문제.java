import java.io.*;
import java.util.*;

public class Main {
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        List<Integer> list = makePrimeList();
        for (int i = 0; i < t; i++) {
            int target = Integer.parseInt(br.readLine());
            findCombination(list, target);
        }
        bw.flush();
    }

    private static void findCombination(List<Integer> list, int target) throws IOException {
        for (int j = 0; j < list.size(); j++) {
            for (int k = 0; k < list.size(); k++) {
                for (int l = 0; l < list.size(); l++) {
                    int a = list.get(j);
                    int b = list.get(k);
                    int c = list.get(l);
                    if (a + b + c == target) {
                        bw.write(a + " " + b + " " + c + "\n");
                        return;
                    }
                }
            }
        }
        bw.write("0\n");
    }

    private static List<Integer> makePrimeList() {
        boolean[] prime = new boolean[1000];
        for (int i = 2; i < prime.length; i++) {
            prime[i] = true;
        }
        for (int i = 2; i < Math.sqrt(1000); i++) {
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = false;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) {
                list.add(i);
            }
        }
        return list;
    }
}