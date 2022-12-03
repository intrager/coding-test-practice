class Solution {
    public String solution(String s) {
        String answer = "";
        int x = (0 + s.length()) / 2;
        if(s.length() % 2 == 1) {
            answer = s.substring(x, x + 1);
        } else {
            answer = s.substring(x-1, x+1);
        }
        return answer;
    }
}