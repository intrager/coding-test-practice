import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<Integer>();
        int temp = 0;
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] == arr[i]) continue;
            list.add(arr[i]);
        }
        return list.stream().mapToInt(v->v).toArray();
    }
}