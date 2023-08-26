import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        B %= 12;
        if(A + B > 12) System.out.print(A + B - 12);
        else System.out.print(A + B);
    }
}