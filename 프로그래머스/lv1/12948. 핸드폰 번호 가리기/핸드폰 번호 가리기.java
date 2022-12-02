import java.util.Arrays;
class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        String answer = "";
        String[] str = phone_number.split("");
        for(int i = 0; i < str.length - 4; i++) {
            str[i] = "*";
        }
        for(String s : str) answer += s;
        return answer;
    }
}