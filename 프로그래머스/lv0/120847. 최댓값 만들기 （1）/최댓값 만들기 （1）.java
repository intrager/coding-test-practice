class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int mul = 0;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                mul = numbers[i] * numbers[j];
                answer = Math.max(answer, mul);
            }
        }
        return answer;
    }
}