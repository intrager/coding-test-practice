import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    //    long a = Long.parseLong(br.readLine());
      //  long b = Long.parseLong(br.readLine());
    
        String a = br.readLine();
        String b = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        for(long i = 0; i < Long.valueOf(a.length()); i++) {
            if(a.charAt((int)i) > b.charAt((int)i)) sb.append(a.charAt((int)i));
            else sb.append(b.charAt((int)i));
        }
        System.out.print(sb.toString());
    }
}