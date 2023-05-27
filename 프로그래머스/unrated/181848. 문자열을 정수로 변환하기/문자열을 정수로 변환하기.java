import java.io.*;

class Solution {
    public int solution(String n_str) throws IOException {
        return Integer.parseInt(n_str.replace("\"", ""));
    }
}