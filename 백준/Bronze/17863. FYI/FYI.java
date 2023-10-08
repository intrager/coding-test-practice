import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String number = br.readLine();
        if(number.substring(0, 3).equals("555")) System.out.print("YES");
        else System.out.print("NO");
    }
}