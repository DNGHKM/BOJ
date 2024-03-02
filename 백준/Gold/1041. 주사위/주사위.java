import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[6];
        int[][] threeArr = {{0, 1, 2}, {0, 1, 3}, {0, 2, 4}, {0, 3, 4}, {1, 2, 5}, {1, 3, 5}, {2, 4, 5}, {3, 4, 5}};
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int minOne = 51;
        for (int i : arr) {
            if(i<minOne) minOne = i;
        }
        int minTwo = 101;
        for (int i = 0; i <6; i++) {
            for (int j = i+1; j <6; j++) {
                if(minTwo>arr[i]+arr[j]&&i+j!=5){
                    minTwo = arr[i]+arr[j];
                }
            }
        }
        int minThree = 151;
        for (int[] ints : threeArr) {
            int tmp = arr[ints[0]] + arr[ints[1]] + arr[ints[2]];
            if (tmp < minThree) {
                minThree = tmp;
            }
        }
        long ans=0;
        if(n>2){
            ans = minOne*(5L *n-6)*(n-2)+4*minTwo*(2L *n-3)+ 4L *minThree;
        }else if(n==2){
            ans = 4L*(minTwo+minThree);
        }else{
            Arrays.sort(arr);
            for (int i = 0; i <5; i++) {
                ans+=arr[i];
            }
        }
        System.out.println(ans);
    }
}