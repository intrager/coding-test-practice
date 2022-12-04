class Solution {
    public int solution(int n) {
        int answer = 1;
        int check = 1;
        for(int i = 1; i <= 11; i++) {
            if(check * i > n) {
                answer = i - 1;
                break;
            }
            check *= i;
        }
        return answer;
    }
}