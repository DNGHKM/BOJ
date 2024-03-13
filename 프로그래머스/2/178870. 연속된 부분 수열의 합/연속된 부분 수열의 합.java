import java.util.*;
class Solution {
    public int[] solution(int[] seq, int k) {
        int sum = seq[0];
        int[] index = {0, 0};
        int minLength = seq.length;
        int[] ans = new int[2];
        while (true) {
            if (sum < k) {
                if(index[1]+1>=seq.length) break;
                sum += seq[++index[1]];
                continue;
            }
            if(sum==k){
                if(index[1]-index[0]<minLength){
                    minLength = index[1]-index[0];
                    ans[0] = index[0];
                    ans[1] = index[1];
                }
            }
            if(index[0]+1>seq.length) break;
            sum -= seq[index[0]++];
        }
        return ans;
    }
}