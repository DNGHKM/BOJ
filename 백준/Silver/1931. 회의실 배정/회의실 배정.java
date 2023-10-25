import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Meeting> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Meeting(s, e));
        }
        Collections.sort(list, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting o1, Meeting o2) {
                if(o1.end == o2.end){
                    return o1.start-o2.start;
                }
                return o1.end-o2.end;
            }
        });
        int count = 1;
        int currentTime = list.get(0).end;
        for (int i = 1; i < list.size(); i++) {
            if(currentTime<=list.get(i).start){
                currentTime=list.get(i).end;
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}
class Meeting{
    int start;
    int end;
    Meeting(int start, int end){
        this.start= start;
        this.end = end;
    }
}