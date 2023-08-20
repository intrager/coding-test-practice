import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String[] availableArr = reader.readLine().split(" ");
        String[] requestedArr = reader.readLine().split(" ");

        int ca = Integer.parseInt(availableArr[0]);
        int ba = Integer.parseInt(availableArr[1]);
        int pa = Integer.parseInt(availableArr[2]);
        
        int cr = Integer.parseInt(requestedArr[0]);
        int br = Integer.parseInt(requestedArr[1]);
        int pr = Integer.parseInt(requestedArr[2]);
    
        int notReceivedTotal = 0;
        if(ca < cr) notReceivedTotal += cr - ca;
        if(ba < br) notReceivedTotal += br - ba;
        if(pa < pr) notReceivedTotal += pr - pa;
        System.out.print(notReceivedTotal);
    }
}