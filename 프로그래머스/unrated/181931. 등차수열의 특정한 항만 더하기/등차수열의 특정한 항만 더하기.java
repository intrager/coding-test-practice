class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] arithArr = new int[included.length];
        arithArr[0] = a;
        for(int i = 1; i < arithArr.length; i++) {
            arithArr[i] = arithArr[i-1] + d;
        }
        for(int i = 0; i < arithArr.length; i++) {
            if(included[i]) answer += arithArr[i];
        }
        return answer;
    }
}