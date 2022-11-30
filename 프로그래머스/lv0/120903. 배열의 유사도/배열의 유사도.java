import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Arrays.sort(s1);
        Arrays.sort(s2);
        int len = s2.length;
        for(int i = 0; i < len; i++) {
            if(Arrays.asList(s1).contains(s2[i])) answer++;
        }
        return answer;
    }
}