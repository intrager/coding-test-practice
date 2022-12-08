class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        if(M < N) {
            answer += M - 1;
            answer += (N - 1) * M;
        } else {
            answer += N - 1;
            answer += (M - 1) * N;
        }
        return answer;
    }
}