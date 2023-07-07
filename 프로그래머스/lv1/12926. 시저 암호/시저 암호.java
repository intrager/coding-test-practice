class Solution {
    public String solution(String s, int n) {
        String answer = s;
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < answer.length(); j++) {
                if(answer.charAt(j) >= 65 && answer.charAt(j) < 90) {
                    sb.append((char)(answer.charAt(j) + 1));
                } else if(answer.charAt(j) == 90) {
                    sb.append('A');
                } else if(answer.charAt(j) >= 97 && answer.charAt(j) < 122) {
                    sb.append((char)(answer.charAt(j) + 1));
                } else if(answer.charAt(j) == 122) {
                    sb.append('a');
                } else {
                    sb.append(answer.charAt(j));
                }
            }
            answer = sb.toString();
        }
        return answer;
    }
}