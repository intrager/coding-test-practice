class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] strArr = my_string.replaceAll("([a-zA-Z])"," ").split(" ");
        for(String s : strArr) {
            if(!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}