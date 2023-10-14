import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[][] arr = new String[n][2];
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[0].equals(o2[0])){
                    return 0;
                } else{
                    return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
                }
            }
        });
        for (String[] a : arr ) {
            result.append(a[0]).append(" ").append(a[1]).append("\n");
        }
        System.out.println(result);
    }
}
