import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int ds = 0, ps = 0;
        while(N-- > 0) {
            String str = br.readLine();
            if("D".equals(str)) ds++;
            else ps++;
            if(Math.abs(ds-ps) >= 2) {
                System.out.print(ds + ":" + ps);
                return;
            }
        }
        System.out.print(ds + ":" + ps);
    }
}