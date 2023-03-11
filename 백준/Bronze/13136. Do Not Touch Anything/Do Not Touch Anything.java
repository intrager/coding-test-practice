import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long R = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        
        if(R % N != 0 && C % N == 0) {
            System.out.print((R/N+1) * (C/N));
        } else if(R % N == 0 && C % N != 0) {
            System.out.print((C/N+1) * (R/N));
        } else if(R % N != 0 && C % N != 0){
            System.out.print((C/N+1) * (R/N+1));
        } else {
            System.out.print((C/N) * (R/N));
        }
    }
}