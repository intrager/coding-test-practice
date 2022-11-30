class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] ar = my_string.replaceAll("[a|e|i|o|u]", "").split("");
        for(int i = 0; i < ar.length; i++) {
            answer += ar[i];
        }
        return answer;
    }
}