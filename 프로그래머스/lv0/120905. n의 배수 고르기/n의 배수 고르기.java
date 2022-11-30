import java.util.stream.*;
import java.util.*;

class Solution {
    public Integer[] solution(int n, int[] numlist) {
        Integer[] answer = IntStream.range(0, numlist.length)
            .filter(i -> numlist[i] % n == 0)
            .mapToObj(i -> numlist[i])
            .toArray(Integer[]::new);
        
//         for(int i = 0; i < numlist.length; i++) {
//             if(numlist[i] % n != 0)
//         }
        return answer;
    }
}