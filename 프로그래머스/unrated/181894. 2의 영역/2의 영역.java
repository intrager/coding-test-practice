class Solution {
    public int[] solution(int[] arr) {
        int start = 0, end = 0, len = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }
        for(int i = arr.length -1; i >= 0; i--) {
            if(arr[i] == 2) {
                end = i;
                break;
            }
        }
        if(start == 0 && end == 0) return new int[]{-1};
        else len = end - start + 1;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = arr[start+i];
        }
        return answer;
    }
}