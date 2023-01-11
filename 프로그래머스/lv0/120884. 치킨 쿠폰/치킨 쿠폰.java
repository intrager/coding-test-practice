class Solution {
    
    public int solution(int chicken) {
        int answer = 0;
        
        int order = chicken / 10;
        int coupon = order + chicken % 10;
        
        while(true) {
            answer += order;
            if(coupon < 10) break;
            
            order = coupon / 10;
            coupon = order + coupon % 10;
        }
        return answer;
    }
}