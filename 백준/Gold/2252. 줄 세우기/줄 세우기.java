import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i <=n; i++) {
            list.add(new ArrayList<>());
        }
        int[] arr = new int[n+1];
        for (int i = 0; i <m; i++) {
            st=new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.get(s).add(e);
        }
        for (ArrayList<Integer> getList : list) {
            for (int b : getList) {
                arr[b]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <=n; i++) {
            if(arr[i]==0) q.add(i);
        }
        while(!q.isEmpty()) {
            int tmp = q.poll();
            bw.write(tmp+" ");
            for (Integer i : list.get(tmp)) {
                arr[i]--;
                if(arr[i]==0){
                    q.add(i);
                }
            }
        }
        bw.flush();
    }
}