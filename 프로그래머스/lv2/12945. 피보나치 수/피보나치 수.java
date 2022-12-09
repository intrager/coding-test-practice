class Solution {
    public int solution(int n) {
        int[] Dy = new int[n + 1];
        Dy[0] = 0;
        Dy[1] = 1;
        Dy[2] = 1;
        Dy[3] = 2;
        
        for(int i = 4; i <= n; i++) {
            Dy[i] = (Dy[i-2] + Dy[i-1]) % 1234567;
        }
        return Dy[n];
    }
}