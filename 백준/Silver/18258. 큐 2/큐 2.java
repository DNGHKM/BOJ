import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        //peekLast 메서드 때문에 Queue 대신 Dequeue 사용
        Deque<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            if(st.nextToken().equals("push")){
                q.add(Integer.parseInt(st.nextToken()));
            } else if(input.equals("pop")){
                try{
                    bw.write(q.remove() +"\n");
                } catch(NoSuchElementException e1){
                    bw.write(-1 +"\n");
                }
            } else if(input.equals("size")){
                bw.write(q.size() +"\n");
            } else if(input.equals("empty")){
                if(q.isEmpty()) {
                    bw.write(1 +"\n");
                }else{
                    bw.write(0 +"\n");
                }
            } else if(input.equals("front")){
                try{
                    bw.write(q.element() +"\n");
                } catch (NoSuchElementException e1){
                    bw.write(-1 +"\n");
                }
            } else if(input.equals("back")){
                if(q.peekLast()==null) {
                    bw.write(-1 + "\n");
                }else {
                    bw.write(q.peekLast() + "\n");
                }
            }
        }
        bw.close();
    }
}