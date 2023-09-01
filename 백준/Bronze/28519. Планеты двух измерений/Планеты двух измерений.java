import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        
        if(N > M) {
            int temp = N;
            N = M;
            M = temp;
        }
        System.out.print(Math.min(N + M, N + N + 1));
    }
}