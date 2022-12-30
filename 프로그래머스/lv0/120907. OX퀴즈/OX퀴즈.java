import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        String[] str = new String[quiz.length];
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            str = quiz[i].split(" ");
            if(str[1].equals("+")) {
                answer[i] = Integer.parseInt(str[0]) + Integer.parseInt(str[2]) == Integer.parseInt(str[4]) ? "O" : "X";
            } else {
                answer[i] = Integer.parseInt(str[0]) - Integer.parseInt(str[2]) == Integer.parseInt(str[4]) ? "O" : "X";
            }           
        }
        return answer;
    }
}