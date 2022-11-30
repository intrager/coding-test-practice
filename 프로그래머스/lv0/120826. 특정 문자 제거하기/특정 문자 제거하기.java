class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String str[] = my_string.split(letter);
        for(String s : str) {
            answer += s;
        }
        return answer;
    }
}