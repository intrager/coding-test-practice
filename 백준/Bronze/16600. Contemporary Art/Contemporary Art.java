import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Double area = Double.parseDouble(br.readLine());
        Double sqrtArea = Math.sqrt(area);
        System.out.printf("%.8f", sqrtArea * 4);
    }
}