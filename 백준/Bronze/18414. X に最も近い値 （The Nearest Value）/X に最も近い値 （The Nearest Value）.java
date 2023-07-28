import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int X = Integer.parseInt(arr[0]);
        int L = Integer.parseInt(arr[1]);
        int R = Integer.parseInt(arr[2]);
        int sub = Integer.MAX_VALUE, answer = L;
        
        for(int i = L; i <= R; i++) {
            if(sub > Math.abs(X-i)) {
                answer = i;
                sub = Math.min(sub, Math.abs(X-i));
            }
        }
        System.out.print(answer);
    }
}