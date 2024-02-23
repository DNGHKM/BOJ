import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i%divisor==0) list.add(i);
        }
        if(list.isEmpty()) list.add(-1);
        int[] ans = new int[list.size()];
        int index = 0;
        for(int i : list){
            ans[index] = i;
            index++;
        }
        Arrays.sort(ans);
        return ans;
    }
}