import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        n %= 8;
        
        if(1 <= n && n < 6) System.out.print(n);
        else if(6 <= n && n < 8) System.out.print(10 - n);
        else System.out.print(Math.abs(10 - n) % 8);
    }
}