import java.io.*;
import java.util.*;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s; i++) {
            result.append(my_string.charAt(i));
        }
        for(int i = 0; i < overwrite_string.length(); i++) {
            result.append(overwrite_string.charAt(i));
        }
        for(int i = s + overwrite_string.length(); i < my_string.length(); i++) {
            result.append(my_string.charAt(i));
        }
        return result.toString();
    }
}