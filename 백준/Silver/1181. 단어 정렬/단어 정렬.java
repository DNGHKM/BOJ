import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }else {
                    return o1.length()-o2.length();
                }
            }
        });
        for (int i = 0; i <arr.length; i++) {
            int j = i+1;
            if (j==arr.length){
                result.append(arr[j-1]);
                break;
            }
            if(!arr[i].equals(arr[j])){
                result.append(arr[i]+"\n");
            }
        }
        System.out.println(result);
    }
}
