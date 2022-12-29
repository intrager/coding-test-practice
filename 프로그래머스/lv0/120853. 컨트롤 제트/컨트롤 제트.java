class Solution {
    public int solution(String s) {
        String[] strArr = s.split(" ");
        int answer = 0;
        for(int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("Z")) {
                answer -= Integer.parseInt(strArr[i-1]);
                continue;
            } else {
                answer += Integer.parseInt(strArr[i]);
            }
        }
        return answer;
    }
}