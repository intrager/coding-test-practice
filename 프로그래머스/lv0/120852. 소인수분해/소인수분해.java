import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        int i = 2;
        while(n >= i) {
            if(n % i == 0) {
                if(!answer.contains(i))
                    answer.add(i);
                n /= i;
            } else 
                i++;
        }
        return answer.stream().mapToInt(d -> d).toArray();
    }
}