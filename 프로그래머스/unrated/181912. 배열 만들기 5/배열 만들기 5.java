import java.util.*;

class Solution {
    public Integer[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
    
        for(int i = 0; i < intStrs.length; i++) {
            if(Integer.parseInt(intStrs[i].substring(s, s+l)) > k) {
                answer.add(Integer.parseInt(intStrs[i].substring(s, s+l)));
            }
        }
        return answer.toArray(new Integer[answer.size()]);
    }
}