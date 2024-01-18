import java.util.*;
class Solution {
    static public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if(!list.contains(i)){
                list.add(i);
            }
        }
        int j = 0;
        for (Integer i : list) {
            if(j<k) {
                answer[j] = i;
                j++;
            }
        }
        for (int i = j; i <k; i++) {
            answer[i] = -1;
        }
        return answer;
    }
}