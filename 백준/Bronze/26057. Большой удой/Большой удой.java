import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int L = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        System.out.print(T * 2 - L);
    }
}