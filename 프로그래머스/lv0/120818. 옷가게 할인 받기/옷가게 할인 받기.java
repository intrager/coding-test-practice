class Solution {
    public int solution(int price) {
        double answer = 0;
        if(price < 100000) {
            answer = price;
        } else if(price < 300000) {
            answer = price * 0.95;
        } else if(price < 500000) {
            answer = price * 0.9;
        } else {
            answer = price * 0.8;
        }
        return Double.valueOf(answer).intValue();
    }
}