import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fact(N));
    }
    
    static int fact(int n) {
        if(n <= 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        }
        return n * fact(n-1);
    }
}