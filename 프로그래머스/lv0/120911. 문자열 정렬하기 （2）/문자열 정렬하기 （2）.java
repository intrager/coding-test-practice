import java.util.Arrays;
class Solution {
    public String solution(String my_string) {    
        String answer = "";
        String[] word = my_string.toLowerCase().split("");
        Arrays.sort(word);
        for(int i = 0; i < word.length; i++) answer += word[i];
        return answer;
    }
}