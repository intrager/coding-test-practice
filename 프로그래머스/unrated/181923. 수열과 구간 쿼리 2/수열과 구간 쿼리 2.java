import java.util.*;

class Solution {
    public Integer[] solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();
        int s, e, k, temp = Integer.MAX_VALUE;
        
        for(int index = 0; index < queries.length; index++) {
            int[] query = queries[index];
            s = query[0];
            e = query[1];
            k = query[2];
            List<Integer> list = new ArrayList<>();
            for(int i = s; i <= e; i++) {
                if(arr[i] > k) list.add(arr[i]);
            }
            
            if(!list.isEmpty()) {
                Collections.sort(list);
                answer.add(list.get(0));
            } else {
                answer.add(-1);
            }
        }
        return answer.toArray(new Integer[answer.size()]);
    }
}