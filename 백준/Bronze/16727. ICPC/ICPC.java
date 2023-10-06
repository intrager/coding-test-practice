import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] first = br.readLine().split(" ");
        String[] second = br.readLine().split(" ");
        
        int p1 = Integer.parseInt(first[0]);
        int s1 = Integer.parseInt(first[1]);
        
        int s2 = Integer.parseInt(second[0]);
        int p2 = Integer.parseInt(second[1]);
        
        int ps = p1 + p2;
        int ss = s1 + s2;
        if(ps == ss) {
            if(s1 == p2) System.out.print("Penalty");
            else if(s1 > p2) System.out.print("Esteghlal");
            else System.out.print("Persepolis");
        } else if(ps > ss) {
            System.out.print("Persepolis");
        } else {
            System.out.print("Esteghlal");
        }
    }
}