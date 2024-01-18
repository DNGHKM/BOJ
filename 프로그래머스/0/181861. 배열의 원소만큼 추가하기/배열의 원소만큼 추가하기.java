import java.util.*;
    
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            for(int j =0; j<i; j++){
                list.add(i);
            }
        }
        int[] answer = new int[list.size()];
        int i = 0;
        for(int j : list){
            answer[i] = j;
            i++;
        }
        return answer;
    }
}