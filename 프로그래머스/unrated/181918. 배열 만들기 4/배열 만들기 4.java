import java.util.List;
import java.util.ArrayList;

class Solution {
    public Integer[] solution(int[] arr) {
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        
        while(i < arr.length) {
            if(stk.isEmpty() || stk.get(stk.size()-1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            } else if(stk.get(stk.size()-1) >= arr[i]) {
                stk.remove(stk.size()-1);
            }
        }
        return stk.toArray(new Integer[stk.size()]);
    }
}