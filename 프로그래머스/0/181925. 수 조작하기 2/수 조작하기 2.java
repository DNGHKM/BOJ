class Solution {
    public String solution(int[] numLog) {
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i<numLog.length; i++){
            int tmp = numLog[i]-numLog[i-1];
            if(tmp==1){
                sb.append("w");
            }else if(tmp==-1){
                sb.append("s");
            }else if(tmp==10){
                sb.append("d");
            }else if(tmp==-10){
                sb.append("a");
            }
        }
        String answer = sb.toString();
        return answer;
    }
}