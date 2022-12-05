import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] answer = new int[str.length];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < str.length; i++) {
            answer[i] = Integer.parseInt(str[i]);
        }
        for(int i : answer) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        return min + " " + max;
    }
}