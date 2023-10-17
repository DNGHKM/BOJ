import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<Integer> hsN = new HashSet<>();
        HashSet<Integer> hsM = new HashSet<>();
        HashSet<Integer> hsUnion = new HashSet<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i <n; i++) {
            hsN.add(Integer.parseInt(st2.nextToken()));
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i = 0; i <m; i++) {
            hsM.add(Integer.parseInt(st3.nextToken()));
        }
        hsUnion.addAll(hsN); //합집합 만들기 1
        hsUnion.addAll(hsM); //합집합 만들기 1
        hsN.retainAll(hsM); //hsN을 hsN과 hsMd의 교집합으로 만듬
        hsUnion.removeAll(hsN); //hsUnion을 합집합 - 교집합 연산
        System.out.println(hsUnion.size()); //대칭차집합 원소갯수 출력
    }
}