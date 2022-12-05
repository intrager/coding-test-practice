import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split("");
        Arrays.sort(strArr);
        int cnt = 0;
        for(int i = 0; i < strArr.length; i++) {
            cnt = 0;
            for(String str : strArr) if(strArr[i].equals(str)) cnt++;
            if(cnt == 1) answer += strArr[i];
        }
        return answer;
    }
}