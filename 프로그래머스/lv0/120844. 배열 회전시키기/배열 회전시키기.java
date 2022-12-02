class Solution {
    public int[] solution(int[] numbers, String direction) {
        int len = numbers.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            if(direction.equals("right")) {
                if(i < numbers.length - 1) answer[i + 1] = numbers[i];
                else answer[0] = numbers[i];
            } else {
                if(i == 0) answer[len-1] = numbers[0];
                else answer[i-1] = numbers[i];
            }
        }
        return answer;
    }
}