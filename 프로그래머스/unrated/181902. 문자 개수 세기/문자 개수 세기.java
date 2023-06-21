class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int alpha = 0;
        for(int i = 0; i < my_string.length(); i++) {
            alpha = (int)my_string.charAt(i);
            if(alpha >= 65 && alpha <= 90) answer[alpha-65]++;
            else if(alpha >= 97 && alpha <= 122) answer[alpha-71]++;
        }
        return answer;
    }
}