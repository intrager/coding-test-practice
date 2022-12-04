import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;


class Solution {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        ArrayList<Integer> adj = new ArrayList<Integer>();
        for(int i : emergency) adj.add(i);
        Collections.sort(adj, Collections.reverseOrder());
        
        for(int i = 0; i < len; i++) {
            answer[i] = adj.indexOf(emergency[i]) + 1;
        }
        return answer;
    }
}