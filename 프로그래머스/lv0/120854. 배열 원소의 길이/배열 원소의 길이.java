class Solution {
    public int[] solution(String[] strlist) {
        int strCnt = 0;
        int len = strlist.length;
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            strCnt = strlist[i].length();
            answer[i] = strCnt;
        }
        return answer;
    }
}