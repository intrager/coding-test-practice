class Solution {
    public int[] solution(int money) {
        int cup = money / 5500;
        int charge = money % 5500;
        int[] answer = {cup, charge};
        
        return answer;
    }
}