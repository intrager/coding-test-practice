import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());
        
        int toZero = 0 - A;
        int endCook = B * E;
        if(toZero > 0)
            System.out.print(-1 * A * C + D + B * E);
        else if(toZero == 0)
            System.out.print(D + B * E);
        else
            System.out.print(E * (B - A));
    }
}