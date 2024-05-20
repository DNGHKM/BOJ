import java.io.*;
import java.util.*;

public class Main {
    static int insert;
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int count = 0;

        int[] result = getGcd(); //성공하면 -1, -1 반환, 아니면 최대공약수가 1이 아닌 두 숫자 반환
        
        while (result[0] != -1) {
            if (getNum(result[0], result[1])) { //최대공약수가 1이 아닌 숫자들 사이에 최대공약수가 1인 숫자 있으면 반환해서 삽입
                list.add(insert);
                Collections.sort(list);
                count++;
            } else { //두 숫자 사이에 최대공약수가 1인 숫자가 없으면
                list.add(result[0] + 1); //양쪽 인덱스 중 작은수 +1 삽입
                count++;
                Collections.sort(list);
            }
            result = getGcd(); //전체 리스트 확인해서 결과 갱신
        }
        System.out.println(count);
    }

    private static boolean getNum(int a, int b) {
        for (int i = a + 1; i < b; i++) {
            if (gcd(i, a) == 1 && gcd(i, b) == 1) {
                insert = i;
                return true;
            }
        }
        return false;
    }

    private static int[] getGcd() {
        for (int i = 0; i < list.size() - 1; i++) {
            int j = i + 1;
            if (gcd(list.get(i), list.get(j)) != 1) {
                return new int[]{list.get(i), list.get(j)};
            }
        }
        return new int[]{-1, -1};
    }

    private static int gcd(int i, int j) {
        if (j == 0)
            return i;
        return gcd(j, i % j);
    }
}