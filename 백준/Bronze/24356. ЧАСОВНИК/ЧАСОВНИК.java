import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = br.readLine().split(" ");
        int t1 = Integer.parseInt(arr[0]);
        int m1 = Integer.parseInt(arr[1]);
        int t2 = Integer.parseInt(arr[2]);
        int m2 = Integer.parseInt(arr[3]);
        
        int time = 0;
        m1 += t1 * 60;
        m2 += t2 * 60;
        if(m1 > m2) m2 += 24 * 60;
        time = m2 - m1;
        
        System.out.print(time + " " + time/30);
    }
}