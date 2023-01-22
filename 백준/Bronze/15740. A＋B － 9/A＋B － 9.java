import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrayForInput = br.readLine().split(" ");
        BigInteger A = new BigInteger(arrayForInput[0]);
        BigInteger B = new BigInteger(arrayForInput[1]);
        bw.write(A.add(B).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}