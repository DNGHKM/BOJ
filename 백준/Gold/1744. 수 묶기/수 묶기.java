import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pqPlus = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        PriorityQueue<Integer> pqMinus = new PriorityQueue<>();
        for (int i = 0; i <n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num>0){
                pqPlus.add(num);
            }else {
                pqMinus.add(num);
            }
        }
        int ans = 0;
        while(!pqPlus.isEmpty()){
            int a = pqPlus.poll();
            if(pqPlus.peek()!=null){
                if(pqPlus.peek()!=1) {
                    int b = pqPlus.poll();
                    ans += a * b;
                }else{
                    ans+=a;
                }
            }else{
                ans+=a;
            }
        }
        while(!pqMinus.isEmpty()){
            int a = pqMinus.poll();
            if(pqMinus.peek()!=null){
                int b = pqMinus.poll();
                ans+=a*b;
            }else{
                ans+=a;
            }
        }
        System.out.println(ans);
    }
}