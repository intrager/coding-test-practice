import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i = 1; i < k; i++) answer[i] = -1;
        answer[0] = arr[0];
        int cnt = 1;
        
        for(int i = 1; i < arr.length; i++) {
            if(cnt >= answer.length) break;
            
            if(isNotDuplicatedNumber(answer, arr[i])) answer[cnt++] = arr[i];
        }
        return answer;
    }
    
    private boolean isNotDuplicatedNumber(int[] intArray, int a) {
        for(int intNumber : intArray) {
            if(intNumber == a) return false;
        }
        return true;
    }
}