import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int U = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
    
        if(N >= 1000) {
            if(U >= 8000 || L >= 260) {
                System.out.print("Very Good");
            } else {
                System.out.print("Good");
            }
        } else {
            System.out.print("Bad");
        }
    }
}