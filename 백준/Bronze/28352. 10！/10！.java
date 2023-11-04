import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        long total = 1L;
        for(int i = N; i > 0; i--) {
            total *= i;
        }
        int week = (int)(total / 60L / 60L / 24L / 7L);
        System.out.print(week);
    }
}