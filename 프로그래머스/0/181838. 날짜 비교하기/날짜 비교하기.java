class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        int dateA = date1[0]*10000+date1[1]*100+date1[2];
        int dateB = date2[0]*10000+date2[1]*100+date2[2];
        if(dateA-dateB<0){
            answer = 1;
        }
        return answer;
    }
}