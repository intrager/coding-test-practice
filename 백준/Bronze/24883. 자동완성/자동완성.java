import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String alphabat = br.readLine();
        if(alphabat.toUpperCase().equals("N")) System.out.print("Naver D2");
        else System.out.print("Naver Whale");
    }
}