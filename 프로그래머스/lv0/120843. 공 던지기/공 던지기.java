class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for(int i = 0; i < k - 1; i++) {
            answer += 2;
            if(answer > numbers.length - 1) answer -= numbers.length;
        }
        return answer;
    }
}