import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] divideForBigInteger = br.readLine().split(" ");
        BigInteger A = new BigInteger(divideForBigInteger[0]);
        BigInteger B = new BigInteger(divideForBigInteger[1]);
        System.out.println(A.multiply(B));
    }
}