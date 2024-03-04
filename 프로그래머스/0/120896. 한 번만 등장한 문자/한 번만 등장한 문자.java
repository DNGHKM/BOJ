import java.util.*;

class Solution {
    public StringBuilder solution(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for (Character c : map.keySet()) {
            if(map.get(c)==1){
                list.add(c);
            }
        }
        list.stream().sorted().forEach(sb::append);
        return sb;
    }
}