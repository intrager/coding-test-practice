import java.math.BigInteger;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        BigInteger point = new BigInteger(p);
        for(int i = 0; i < t.length() - p.length()+1; i++) {
            BigInteger part = new BigInteger(t.substring(i, i + p.length()));
            if(part.compareTo(point) <= 0) answer++;
        }
        return answer;
    }
}