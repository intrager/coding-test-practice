import java.util.*;

class Solution {
    public Integer[] solution(int n) {
        int cnt = 0;
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n != 1) {
            if(n % 2 == 0) n /= 2;
            else n = 3 * n + 1;
            answer.add(n);
            cnt++;
        }
        return answer.toArray(new Integer[cnt]);
    }
}