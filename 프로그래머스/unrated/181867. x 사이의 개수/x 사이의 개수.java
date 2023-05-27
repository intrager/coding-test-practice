class Solution {
    public int[] solution(String myString) {
        String[] str = myString.split("x");
        int[] answer = {};
        
        if(myString.charAt(myString.length()-1) == 'x') {
            answer = new int[str.length + 1];
            for(int i = 0; i < str.length; i++) {
                answer[i] = str[i].length();
                answer[str.length] = 0;
            }
        } else {
            answer = new int[str.length];
            for(int i = 0; i < str.length; i++) {
                answer[i] = str[i].length();
            }
        }
        return answer;
    }
}