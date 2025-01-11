import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("/")).mapToInt(Integer::parseInt).toArray();
        String s = "gosu";
        if (arr[0] + arr[2] < arr[1] || arr[1] == 0) {
            s = "hasu";
        }
        System.out.print(s);
    }
}