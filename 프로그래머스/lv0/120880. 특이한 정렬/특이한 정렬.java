import java.util.List;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public Integer[] solution(int[] numlist, int n) {
        List<Integer> answer = IntStream.of(numlist).boxed().collect(Collectors.toList());
        
        answer.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer v1, Integer v2) {
                int val1 = Math.abs(v1 - n);
                int val2 = Math.abs(v2 - n);
                
                if(val1 == val2) {
                    if(v1 > v2) return -1;
                    else if(v1 < v2) return 1;
                } else {
                    return val1 - val2;
                }
                
                return 0;
            }
        });
        
        return answer.toArray(new Integer[0]);
    }
}