import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = (int)Math.sqrt(n); i <=(int)Math.sqrt(m); i++) {
            if(n<=i*i&&i*i<=m){
                list.add(i*i);
            }
        }
        int sum = 0;
        for (Integer i : list) {
            sum+=i;
        }
        if(!list.isEmpty()) {
            System.out.println(sum);
            System.out.println(list.get(0));
        }else{
            System.out.println(-1);
        }
    }
}