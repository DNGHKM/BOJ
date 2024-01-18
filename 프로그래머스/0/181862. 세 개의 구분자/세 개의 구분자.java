import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] arr;
        myStr = myStr.replace('a',' ');
        myStr = myStr.replace('b',' ');
        myStr = myStr.replace('c',' ');
        arr = myStr.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            if(!s.isBlank()){
                list.add(s);
            }
        }
        if(list.isEmpty()) list.add("EMPTY");
        String[] answer = new String[list.size()];
        int i = 0;
        for (String s : list) {
            answer[i] = s;
            i++;
        }
        return answer;
    }
}