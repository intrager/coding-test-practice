import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        
        while(N != -1) {
            sum += N;
            N = Integer.parseInt(br.readLine());
        }
        System.out.print(sum);
    }
}