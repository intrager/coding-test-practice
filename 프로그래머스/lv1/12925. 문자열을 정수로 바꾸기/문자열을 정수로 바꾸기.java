class Solution {
    public int solution(String s) {
        boolean sign = true;
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '-')
                sign = false;
            else if(ch != '+')
                answer = answer * 10 + (ch - '0');
        }
        return (sign ? 1 : -1) * answer;
    }
}