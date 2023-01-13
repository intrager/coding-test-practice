class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean flag = false;
        int arithmetic = 0;  
        int geometric = 0;
        
        for(int i = 0; i < common.length - 2; i++) {
            if(common[i+1] - common[i] == common[i+2] - common[i+1]) { // 등차
                flag = true;
                arithmetic = common[i+1] - common[i];
            } else { // 등비
                geometric = common[i+1] / common[i];
                break;
            }
        }
        if(flag) { // 등차
            return common[common.length-1] + arithmetic;
        } else { // 등비
            return common[common.length-1] * geometric;
        }
    }
}