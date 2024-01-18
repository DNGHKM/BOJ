class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        int num = start_num;
        int i = 0;
        while(i<answer.length){
            answer[i]=num;
            i++;
            num++;
        }
        return answer;
    }
}