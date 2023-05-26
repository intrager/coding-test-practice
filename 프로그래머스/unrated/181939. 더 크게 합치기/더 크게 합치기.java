import java.io.*;
import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        sb1.append(a).append(b);
        sb2.append(b).append(a);
        
        if(sb1.toString().compareTo(sb2.toString()) >= 0) {
            return Integer.parseInt(sb1.toString());
        } else {
            return Integer.parseInt(sb2.toString());
        }
    }
}