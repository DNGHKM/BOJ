class Solution {
    public int solution(int[] priorities, int location) {
        int count = 0;
        for(int i =0; i < priorities.length; i++){
            if(priorities[i]>priorities[location]){
                count++;
            }
        }
        for(int i =0; i < location; i++){
            if(priorities[i]==priorities[location]){
                count++;
            }
        }
        int answer = count+1;
        return answer;
    }
}