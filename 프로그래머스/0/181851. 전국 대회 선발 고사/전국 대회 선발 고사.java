import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i <rank.length; i++) {
            map.put(rank[i],i);
        }
        int num = 10000;
        int answer = 0;
        for (int i = 1; i <=map.size(); i++) {
            if(attendance[map.get(i)]){
                answer+=num*map.get(i);
                num/=100;
            }
        }
        return answer;
    }
}