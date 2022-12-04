import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int dist = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            int abs = array[i] - n < 0 ?  -(array[i] - n) : array[i] - n;
            if(abs < dist) {
                dist = abs;
                answer = array[i];
            }       
        }
        return answer;
    }
}