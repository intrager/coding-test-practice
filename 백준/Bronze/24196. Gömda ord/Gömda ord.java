import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String origin = br.readLine();
        int len = origin.length()-1;
        
        StringBuilder sb = new StringBuilder();
        int index = 0;
        
        while(index < len) {
            char ch = origin.charAt(index);
            sb.append(ch);
            index += ch - 'A' + 1;
        }
        sb.append(origin.charAt(len));
        System.out.print(sb.toString());
    }
}