class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int newB = b / gcd(a, b);
        while(newB != 1) {
            if(newB % 2 == 0) newB /= 2;
            else if(newB % 5 == 0) newB /= 5;
            else return 2;
        }
        // 3. 2 혹은 5가 존재하면 1, 1말고 그 외 다른 수가 나오면 무한소수임 -> 2
        return 1;
    }
    
    private int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}