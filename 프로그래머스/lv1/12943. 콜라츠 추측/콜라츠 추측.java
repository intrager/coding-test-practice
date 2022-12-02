class Solution {
    public int solution(int num) {
        long l = num;
        if(l == 1) return 0;
        for(int i = 0; i < 500; i++) {
            if(l == 1) return i;
            l = l % 2 == 0 ? l / 2 : l * 3 + 1;
        }
        return -1;
    }
}