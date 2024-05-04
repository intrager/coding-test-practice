class Solution {
    public int solution(int storey) {
        int answer = 0;
        if(storey <= 1) return 1;
        int rest;
        while(storey != 0) {
            rest = storey % 10;
        
            if(rest >= 6) {
                storey += 10 - rest;
                answer += 10 - rest;
            } else if(rest == 5 && (storey / 10) % 10 >= 5) {
                storey += 10 - rest;
                answer += 10 - rest;
            } else {
                answer += rest;
            }
            storey /= 10;
        }
        
        return answer;
    }
}