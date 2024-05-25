import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
​
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(i == j) continue;
                answer.add(numbers[i] + numbers[j]);
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}