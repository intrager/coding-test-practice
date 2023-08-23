import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int[] arr = new int[26];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if(arr[ch - 'A'] == -1) {
                arr[ch - 'A'] = i;
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == -1) System.out.print((char)(i + 'A'));
        }
    }
}