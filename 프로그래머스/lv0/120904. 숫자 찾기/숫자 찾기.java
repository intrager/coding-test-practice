class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] str = String.valueOf(num).split("");
        String ch = String.valueOf(k);
        for(int i = 0; i < str.length; i++) {
            if(ch.equals(str[i])) {
                answer = i + 1;
                break;
            }
        }
        return answer;
    }
}