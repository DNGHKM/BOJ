import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] ans = new int[(int)Math.ceil((double)n/2)];
        int num = 1;
        for(int i = 0; i < ans.length; i++){
            ans[i] = num;
            num+=2;
        }
        return ans;
    }
}