import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0, cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < attendance.length; i++) {
            if(attendance[i]) map.put(rank[i], i);
        }
        int[] arr = new int[map.size()];
        Iterator<Integer> iter = map.keySet().iterator();
        
        while(iter.hasNext()) {
            arr[cnt++] = iter.next();
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < map.size(); i++) {
            list.add(map.get(arr[i]));
        }
        answer = list.get(0) * 10000 + list.get(1) * 100 + list.get(2);
        return answer;
    }
}