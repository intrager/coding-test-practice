import java.util.Queue;
import java.util.LinkedList;

class Solution {
    boolean solution(String s) {
        Queue<Character> que = new LinkedList<>();
        int cnt = 0;
        
        for(int i = 0; i < s.length(); i++) {
            que.add(s.charAt(i));
            if(s.charAt(i) == '(') cnt++;
            else cnt--;
            if(cnt < 0) return false;
        }
        return cnt > 0 ? false : true;
    }
}