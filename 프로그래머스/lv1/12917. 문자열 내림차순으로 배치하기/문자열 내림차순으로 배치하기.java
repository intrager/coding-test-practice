import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        Arrays.sort(answer);
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.stream(answer).collect(Collectors.joining())).reverse();
        
        return sb.toString();
    }
}