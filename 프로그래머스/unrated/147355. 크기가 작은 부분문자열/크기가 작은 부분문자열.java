import java.util.stream.LongStream;

class Solution {
    public int solution(String t, String p) {
        long targetNumber = Long.parseLong(p);
        int targetNumberLength = p.length();
        
        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                               .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                               .mapToLong(Long::parseLong)
                               .filter(number -> number <= targetNumber)
                               .count();
    }
}