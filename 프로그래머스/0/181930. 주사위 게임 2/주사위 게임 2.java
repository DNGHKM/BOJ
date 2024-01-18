class Solution {
    public int solution(int a, int b, int c) {
        int sum = a+b+c;
        int multi = a*a+b*b+c*c;
        int triple = a*a*a+b*b*b+c*c*c;
        int answer = 0;
        if(a!=b&&b!=c&&a!=c){
            answer += sum;
        }else if(a==b&&b==c){
            answer += sum*multi*triple;
        }else{
            answer +=  sum*multi;
        }
        return answer;
    }
}