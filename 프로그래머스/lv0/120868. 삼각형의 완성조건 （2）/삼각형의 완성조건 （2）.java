import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        int cnt = 0;
        while(cnt < sides[1]) {
            cnt++;
            if(sides[0] + cnt > sides[1]) answer++;
        }
        while(sides[0] + sides[1] - 1 > cnt) {
            cnt++;
            answer++;
        }
        return answer;
    }
}