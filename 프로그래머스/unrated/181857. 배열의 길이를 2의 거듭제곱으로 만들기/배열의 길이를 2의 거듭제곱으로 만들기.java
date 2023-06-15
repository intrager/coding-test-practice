
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int len = 0;
        for(int i = 0; i <= 10; i++) {        
            if(Integer.compare(arr.length, (int)Math.pow(2.0, i)) < 0) {
                len = (int)Math.pow(2.0, i);
                answer = new int[len];
                break;
            } else if(Integer.compare(arr.length, (int)Math.pow(2.0, i)) == 0) {
                return arr;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}