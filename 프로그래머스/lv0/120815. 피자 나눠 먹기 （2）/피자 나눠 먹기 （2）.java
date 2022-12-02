class Solution {
    public int solution(int n) {
        int gcd = getGCD(n, 6);
        return (n * 6) / gcd / 6;
    }
    
    private static int getGCD(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        return getGCD(num2, num1%num2);
    }
}