import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
    
        if(A * 7 == P * 13) System.out.print("lika");
        else if(A * 7 > P * 13) System.out.print("Axel");
        else System.out.print("Petra");
    }
}