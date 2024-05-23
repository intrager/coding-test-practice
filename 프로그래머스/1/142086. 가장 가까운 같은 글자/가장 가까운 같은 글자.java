class Solution {
    public int[] solution(String s) {
        char[] ch = s.toCharArray();
        int len = ch.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            answer[i] = -1;
            for(int j = 1; j <= i; j++) {
                if(ch[i - j] == ch[i]) {
                    answer[i] = j;
                    break;
                }
            }
        }
        return answer;
    }
}