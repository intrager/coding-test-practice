class Solution {
    public int solution(String[] strArr) {
        int answer = 0, len = 0, cnt = 0;
        for(String s : strArr) len = Math.max(len, s.length());
        int[] arr = new int[len];
        for(int i = 0; i < strArr.length; i++) {
            arr[strArr[i].length()-1]++;
        }
        for(int i : arr) answer = Math.max(answer, i);
        return answer;
    }
}