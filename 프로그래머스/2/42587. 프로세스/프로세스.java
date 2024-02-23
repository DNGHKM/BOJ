import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int[] ascend = priorities.clone();
        Arrays.sort(ascend);
        int maxIndex = ascend.length-1;
        int index = 0;
        int count = 0;
        while(priorities[location]!=0){
            int max = ascend[maxIndex];
            if(priorities[index]==max){
                priorities[index]=0;
                count++;
                index++;
                if(index>=priorities.length) index = 0;
                maxIndex--;
            }else{
                index++;
                if(index>=priorities.length) index = 0;
            }
        }
        return count;
    }
}