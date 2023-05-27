class Solution {
    public int solution(String my_string, String target) {
        return my_string.replace(target, "").equals(my_string) ? 0 : 1;
    }
}