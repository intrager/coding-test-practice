class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int cnt = arr.length;
        for(int i = 0; i < cnt; i++) {
            answer += arr[i];
        }
        return answer / cnt;
    }
}