class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGCD(n, m);
        answer[1] = (n * m) / getGCD(n,m);
        return answer;
    }
    
    private int getGCD(int a, int b) {
        return a % b == 0 ? b : getGCD(b, a % b);
    }
}