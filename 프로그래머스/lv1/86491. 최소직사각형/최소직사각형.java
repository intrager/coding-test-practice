import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int w = 1, h = 1;
        for(int i = 0; i < sizes.length; i++) {
            int maxLength = 0, minLength = 0;
            maxLength = Math.max(sizes[i][0], sizes[i][1]);
            minLength = Math.min(sizes[i][0], sizes[i][1]);
            w = Math.max(w, maxLength);
            h = Math.max(h, minLength);
        }
        return w * h;
    }
}