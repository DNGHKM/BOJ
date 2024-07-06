import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        int b = -1;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            listA.add(i);
            listB.add(i);
        }
        int resp = -1;
        while (resp != 1) {
            int index = (int) (Math.random() * listA.size());
            int num = listA.get(index);
            System.out.println("? A " + num);
            listA.remove(index);
            if (sc.nextInt() == 1) {
                resp = 1;
                a = num;
            }
        }
        resp = -1;
        while (resp != 1) {
            int index = (int) (Math.random() * listB.size());
            int num = listB.get(index);
            System.out.println("? B " + num);
            listB.remove(index);
            if (sc.nextInt() == 1) {
                resp = 1;
                b = num;
            }
        }
        System.out.println("! " + (a + b));
    }
}
