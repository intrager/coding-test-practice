import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for(int[] query : queries) {
            char[] temp = Arrays.copyOf(arr, arr.length);
            for(int i = query[1]; i >= query[0]; i--) {
                arr[query[1]-i+query[0]] = temp[i];
            }
        }
        StringBuilder answer = new StringBuilder();
        for(char c : arr) {
            answer.append(c);
        }
        return answer.toString();
    }
}