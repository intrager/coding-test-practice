import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] sliceArr = br.readLine().split(" ");
        String[] wholeArr = br.readLine().split(" ");
        
        int A1 = Integer.parseInt(sliceArr[0]);
        int P1 = Integer.parseInt(sliceArr[1]);
        
        int R1 = Integer.parseInt(wholeArr[0]);
        int P2 = Integer.parseInt(wholeArr[1]);
        
        double sliceWorth = (double)A1 / P1;
        double wholeWorth = Math.PI * R1 * R1 / P2;
        
        if(Double.compare(sliceWorth, wholeWorth) > 0) 
            System.out.print("Slice of pizza");
        else
            System.out.print("Whole pizza");
    }
}