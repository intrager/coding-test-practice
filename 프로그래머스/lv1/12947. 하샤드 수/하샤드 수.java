class Solution {
    public boolean solution(int x) {
        int a = x;
        int rest = 0;
        while(a >= 1) {
            rest += a % 10;
            a /= 10;
        }
        return x % rest == 0 ? true : false;
    }   
}