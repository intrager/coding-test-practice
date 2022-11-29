class Solution {
    public int[] solution(int[] num_list) {
        int cnt = num_list.length;
        int[] answer = new int[cnt];
        for(int i = cnt - 1; i >= 0; i--) {
            answer[cnt - i - 1] = num_list[i];
        }
        return answer;
    }
}