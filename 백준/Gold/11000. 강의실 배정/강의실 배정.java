import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Lecture> pq = new PriorityQueue<>(new Comparator<Lecture>() {
            @Override
            public int compare(Lecture o1, Lecture o2) {
                return o1.e-o2.e;
            }
        });
        List<Lecture> list = new ArrayList<>();
        for (int i = 0; i <n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Lecture(s, e));
        }
        Collections.sort(list, new Comparator<Lecture>() {
            @Override
            public int compare(Lecture o1, Lecture o2) {
                return o1.s-o2.s;
            }
        });
        int count = 0;
        for (Lecture lecture : list) {
            if(pq.isEmpty()){
                count++;
                pq.add(new Lecture(lecture.s, lecture.e));
            }else if(pq.peek().e<= lecture.s){
                pq.poll();
                pq.add(new Lecture(lecture.s, lecture.e));
            }else{
                pq.add(new Lecture(lecture.s, lecture.e));
                count++;
            }
        }
        System.out.println(count);
    }
}
class Lecture{
    int s;
    int e;

    public Lecture(int s, int e) {
        this.s = s;
        this.e = e;
    }
}
