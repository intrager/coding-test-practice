import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(t-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            BigInteger x = new BigInteger(st.nextToken());
            BigInteger y = new BigInteger(st.nextToken());
            System.out.println(x.add(y));
        }
    }
}