class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow;
        for(int i = size; i > 0; i--) {
            if(size % i == 0 && i >= size / i && size / i > 2) {
                int l = i;
                int h = size / i;
                if(brown == (l + h) * 2 - 4) {
                    answer[0] = l;
                    answer[1] = h;
                }
            }
        }
        return answer;
    }
}