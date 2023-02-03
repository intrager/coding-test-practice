import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int Z = Integer.parseInt(br.readLine());
        int W, K;
        StringTokenizer st;
        while(Z-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            W = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            if(W*K == 1) System.out.println(0);
            else System.out.println(W*K/2);
        }
    }
}