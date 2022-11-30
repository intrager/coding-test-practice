class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] ar = my_string.replaceAll("[a-zA-Z]","").split("");
        for(int i = 0; i < ar.length; i++) {
            answer += Integer.valueOf(ar[i]);
        }
        return answer;
    }
}