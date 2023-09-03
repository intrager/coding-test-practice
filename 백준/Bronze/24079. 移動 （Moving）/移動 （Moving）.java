import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int X = Integer.parseInt(br.readLine());
        int Y = Integer.parseInt(br.readLine());
        int Z = Integer.parseInt(br.readLine());
    
        boolean isInner = X * 60 + Y * 60 <= Z * 60 + 30;
        System.out.print(isInner ? 1 : 0);
    }
}