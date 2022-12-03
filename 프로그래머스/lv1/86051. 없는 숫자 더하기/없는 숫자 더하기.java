import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int[] check = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i; j < check.length; j++) {
                if(numbers[i] == check[j]) {
                    answer -= numbers[i];
                    break;
                }
            }
        }
        return answer;
    }
}