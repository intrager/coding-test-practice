import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] chBe = before.toCharArray();
        char[] chAf = after.toCharArray();
        Arrays.sort(chBe);
        Arrays.sort(chAf);
        for(int i = 0; i < chBe.length; i++) {
            if(chBe[i] != chAf[i]) {
                answer = 0;
                break;
            }
        }
        return answer;
    }
}