class Solution {
    private String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public int solution(String s) {
        char[] arr = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        String answer = "";
        for(char ch : arr) {
            char c = Character.toLowerCase(ch);
            if(c < 97 || c > 122) {
                sb = new StringBuffer();
                answer += Character.getNumericValue(c);
            } else {
                sb.append(c);
                if(isNumber(sb.toString())) {
                    answer += convertToInt(sb.toString());
                    sb = new StringBuffer();
                }
            }
        }
        return Integer.parseInt(answer);
    }
    
    private boolean isNumber(String str) {
        for(String alphabet : numbers) {
            if(str.equals(alphabet))
                return true;
        }
        return false;
    }
    
    private int convertToInt(String str) {
        for(int i = 0; i < numbers.length; i++) {
            if(str.equals(numbers[i])) {
                return i;
            }
        }
        return 0;
    }
}