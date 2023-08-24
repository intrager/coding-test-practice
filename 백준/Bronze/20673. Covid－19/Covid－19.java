import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int p = Integer.parseInt(br.readLine());
        int q = Integer.parseInt(br.readLine());
        if(p <= 50) {
            if(q <= 10) System.out.print("White");
            else if(q > 10 && q <= 30) System.out.print("Yellow");
            else System.out.print("Red");
        } else {
            if(q > 30) System.out.print("Red");
            else System.out.print("Yellow");
        }
    }
}