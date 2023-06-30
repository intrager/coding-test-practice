import java.util.*;

class Solution {
    public Integer[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        
        while(i < arr.length) {
            if(list.size() == 0) {
                list.add(arr[i]);
                i++;
            } else if(list.size() != 0 && list.get(list.size()-1) == arr[i]) {
                list.remove(list.size()-1);
                i++;
            } else if(list.size() != 0 && list.get(list.size()-1) != arr[i]) {
                list.add(arr[i]);
                i++;
            }
        }
        if(list.size() == 0) return new Integer[]{-1};
        return list.toArray(new Integer[list.size()]);
    }
}