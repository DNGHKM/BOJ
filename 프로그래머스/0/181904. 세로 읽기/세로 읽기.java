class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer sb = new StringBuffer();
        int index = c;
        while(index<=my_string.length()){
            sb.append(my_string.charAt(index-1));
            index+=m;
        }
        String answer = sb.toString();
        return answer;
    }
}