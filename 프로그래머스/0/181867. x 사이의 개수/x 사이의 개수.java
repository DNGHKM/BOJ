import java.util.*;
class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for(int i =0; i<myString.length(); i++){
            if(myString.charAt(i)!='x'){
                index++;
            }else{
                list.add(index);
                index = 0;
            }
            if(i==myString.length()-1){
                list.add(index);
            }
        }
        answer = new int[list.size()];
        int i = 0;
        for(int j : list){
            answer[i] = j;
            i++;
        }
        return answer;
    }
}