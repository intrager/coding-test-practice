class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        int[] alphabet = new int[26];
        
        for(int i = 0; i < 26; i++) {
            alphabet[i] = -1;
        }
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < 26; j++) {
                if(alphabet[j] >= 0) {
                    alphabet[j]++;
                }
            }
            answer[i] = alphabet[(int)(s.charAt(i)) - (int)'a'];
            alphabet[(int)(s.charAt(i)) - (int)'a'] = 0;
        }
        return answer;
    }
}