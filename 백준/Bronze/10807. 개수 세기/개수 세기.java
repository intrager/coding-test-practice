import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        int answer = 0;
        
        for(String s : arr) {
            if(s.equals(String.valueOf(v))) answer++;
        }
        System.out.println(answer);
    }
}