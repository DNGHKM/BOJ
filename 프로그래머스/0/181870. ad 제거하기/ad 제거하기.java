import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for(String s : strArr){
            if(!s.contains("ad")){
                list.add(s);
            }
        }
        String[] answer = new String[list.size()];
        int i = 0;
        for(String s : list){
            answer[i] = s;
            i++;
        }
        return answer;
    }
}