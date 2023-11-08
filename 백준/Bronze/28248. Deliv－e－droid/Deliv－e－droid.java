import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int p = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
    
        int psum = p * 50, csum = c * 10;
        int sum = psum - csum;
        if(p > c) sum += 500;
        System.out.print(sum);
    }
}