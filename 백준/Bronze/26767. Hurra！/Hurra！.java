import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= N; i++) {
            if(i % 7 == 0 && i % 11 != 0) System.out.println("Hurra!");
            else if(i % 7 != 0 && i % 11 == 0) System.out.println("Super!");
            else if(i % 7 == 0 && i % 11 == 0) System.out.println("Wiwat!");
            else System.out.println(i);
        }
    }
}