import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] strArr = br.readLine().split("/");
        int K = Integer.parseInt(strArr[0]);
        int D = Integer.parseInt(strArr[1]);
        int A = Integer.parseInt(strArr[2]);
        
        if(K + A < D) System.out.print("hasu");
        else if(D == 0) System.out.print("hasu");
        else System.out.print("gosu");
    }
}