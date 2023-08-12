import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++) {
            String deadLine = br.readLine().replace("D-", "");
            if(Integer.parseInt(deadLine) <= 90) count++;
        }
        System.out.print(count);
    }
}