import java.util.*;

class Solution {
    public Integer[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            if(isConsistOfFiveOrZero(String.valueOf(i))) list.add(i);
        }
        if(list.size() == 0) return new Integer[]{-1};
        return list.toArray(new Integer[list.size()]);
    }
    
    private boolean isConsistOfFiveOrZero(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '5' || str.charAt(i) == '0') {}
            else return false;
        }
        return true;
    }
}