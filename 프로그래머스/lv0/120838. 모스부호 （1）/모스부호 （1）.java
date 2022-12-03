import java.util.Arrays;
class Solution {
    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] str = letter.split(" ");
        String answer = "";
        for(int i = 0; i < str.length; i++) {
            for(int s = 0; s < morse.length; s++) {
                if(str[i].equals(morse[s])) {
                    answer += (char)(s + 97);
                }
            }
        }
        return answer;
    }
}