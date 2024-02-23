import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i <clothes.length; i++) {
            if(!map.containsKey(clothes[i][1])) {
                map.put(clothes[i][1],1);
            }else{
                int tmp = map.get(clothes[i][1]);
                map.replace(clothes[i][1],++tmp);
            }
        }
        int ans = 1;
        for (Integer i : map.values()) {
            ans *=(i+1);
        }
        return ans-1;
    }
}