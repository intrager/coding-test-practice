import java.util.Arrays;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        
        int len = arrA.length;
        for(int i = 0; i < len; i++) {
            if(Arrays.equals(arrA, arrB)) {
                return answer;
            }
            char temp = arrA[len-1];
            for(int j = 1; j < len; j++) {
                arrA[len-j] = arrA[len-j-1];
            }
            arrA[0] = temp;
            answer++;
        }
        return -1;
    }
}