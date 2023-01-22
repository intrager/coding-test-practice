import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine();
        long remainder = 0;
        
        for(int i = 0; i < N.length(); i++) {
            remainder = (remainder * 10 + (Character.getNumericValue(N.charAt(i)))) % 20000303;
        }
        
        bw.write(Long.toString(remainder));
        bw.flush();
        bw.close();
        br.close();
    }
}