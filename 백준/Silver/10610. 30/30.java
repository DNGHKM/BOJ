import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String s = sc.next();
        int[] arr = new int[s.length()];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = s.charAt(i)-'0';
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        if(arr[0]==0&&sum%3==0){
            for (int i = arr.length-1; i >=0; i--) {
                sb.append(arr[i]);
            }
        }else{
            sb.append(-1);
        }
        System.out.println(sb);
    }
}
