class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer sb = new StringBuffer();
        for(int i : index_list){
            sb.append(my_string.charAt(i));
        }
        String answer = sb.toString();
        return answer;
    }
}