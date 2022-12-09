class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        int cnt = 0;
        for(String str : array) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }
        return answer;
    }
}