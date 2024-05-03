import java.util.Stack;
class Solution {
    public int solution(String s) {
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        
        for(String str : arr) {
            if(!stack.empty() && stack.peek().equals(str)) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}