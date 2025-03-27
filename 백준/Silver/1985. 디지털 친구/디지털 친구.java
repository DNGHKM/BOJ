import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int[] arrA;
    static int[] arrB;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String a = sc.next();
            String b = sc.next();
            makeArr(a, b);
            if (isFriends()) {
                sb.append("friends\n");
                continue;
            }
            if (isAlmostFriends(arrA) || isAlmostFriends(arrB)) {
                sb.append("almost friends\n");
                continue;
            }
            sb.append("nothing\n");
        }
        System.out.println(sb);
    }

    private static boolean isAlmostFriends(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < 9 && arr[i + 1] > 0) {
                arr[i]++;
                arr[i + 1]--;
                if (isFriends()) {
                    return true;
                }
                arr[i]--;
                arr[i + 1]++;
            }

            if (i == 0 && arr[0] == 1) {
                continue;
            }
            if (arr[i] > 0 && arr[i + 1] < 10) {
                arr[i]--;
                arr[i + 1]++;
                if (isFriends()) {
                    return true;
                }
                arr[i]++;
                arr[i + 1]--;
            }
        }
        return false;
    }

    private static boolean isFriends() {
        Set<Integer> setA = new HashSet<>();
        for (int i : arrA) {
            setA.add(i);
        }
        Set<Integer> setB = new HashSet<>();
        for (int i : arrB) {
            setB.add(i);
        }
        return setA.equals(setB);
    }

    private static void makeArr(String a, String b) {
        arrA = new int[a.length()];
        arrB = new int[b.length()];
        for (int i = 0; i < a.length(); i++) {
            arrA[i] = a.charAt(i) - '0';
        }
        for (int i = 0; i < b.length(); i++) {
            arrB[i] = b.charAt(i) - '0';
        }
    }
}