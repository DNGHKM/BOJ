import java.io.*;
import java.util.*;

class Main {
    static int n;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0 ,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i <n; i++) {
            String input = br.readLine();
            for (int j = 0; j <n; j++) {
                arr[i][j]=input.charAt(j)-48;
            }
        }
        Queue<int[]> q = new LinkedList<>();
        ArrayList<Integer> house = new ArrayList<>();
        int count = 0;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if(arr[i][j]==1) {
                    int[] start = {i,j};
                    q.add(start);
                    arr[i][j]=0;
                    count++;
                }
                int houseCount=0;
                while(!q.isEmpty()) {
                    int[] tmp = q.poll();
                    houseCount++;
                    for (int k = 0; k < 4; k++) {
                        if (rangeCheck(tmp[0], tmp[1], k)) {
                            if (arr[tmp[0] + dx[k]][tmp[1] + dy[k]] == 1) {
                                int[] next= {tmp[0] + dx[k], tmp[1] + dy[k]};
                                q.add(next);
                                arr[next[0]][next[1]]=0;
                            }
                        }
                    }
                }
                if(houseCount!=0) house.add(houseCount);
            }
        }
        bw.write(count+"\n");
        Collections.sort(house);
        for (Integer i : house) {
            bw.write(i+"\n");
        }
        bw.flush();
    }

    private static boolean rangeCheck(int i, int j, int k) {
        return 0 <= i + dx[k] && i + dx[k] < n && 0 <= j + dy[k] && j + dy[k] < n;
    }
}