import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String[] ar = my_string.replaceAll("[a-zA-z]","").split("");
        Arrays.sort(ar);
        int len = ar.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = Integer.valueOf(ar[i]);
        }
        return answer;
    }
}