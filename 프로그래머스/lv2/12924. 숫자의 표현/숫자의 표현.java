class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; n > 0; n -= i++)
            if (n % i == 0) ++answer;
        return answer;
    }
}