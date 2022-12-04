import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);
        for(char c : str.toCharArray()) {
            if(c == '7') answer++;
        }
        return answer;
    }
}