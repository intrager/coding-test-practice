import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0, number = toBinaryOne(n);
        while(true) {
            if(number == toBinaryOne(++n)) {
                answer = n;
                break;
            }
        }
        return answer;
    }
    
    private int toBinaryOne(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') count++;
        }
        return count;
    }
}