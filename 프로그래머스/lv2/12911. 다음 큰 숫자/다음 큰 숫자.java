import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = n, temp = n, standardCount = 0;
        char[] convertedStandardArray = convertToArray(n);
        standardCount = countOneInConvertedNumberToBinary(convertedStandardArray);
        
        while(answer < 1000000) {
            if(standardCount == countOneInConvertedNumberToBinary(convertToArray(++answer))) break;
        }
        return answer;
    }
    
    private char[] convertToArray(int number) {
        return Integer.toBinaryString(number).toCharArray();
    }
    private int countOneInConvertedNumberToBinary(char[] charArray) {
        int countingOne = 0;
        for(char ch : charArray) {
            if(ch == '1') countingOne++;
        }
        return countingOne;
    }
}