import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] right = new int[n];
        for (int i = 0; i <n; i++) {
            right[i] = i+1;
        }
        int num = 1;
        int j = 0;
        for (int i = 0; i <n; i++) {
            right[i]=i+1;
            st.push(sc.nextInt());
            if (num == st.peek()) {
                arr[j] = st.pop();
                num++;
                j++;
            }
            while(!st.empty()){
                if(num == st.peek()) {
                    arr[j] = st.pop();
                    num++;
                    j++;
                } else{
                    break;
                }
            }
        }
        while(!st.empty()){
            arr[j]=st.pop();
            j++;
        }
        if(Arrays.equals(arr,right)){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
    }
}