import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] naturalSeries = new int[4];
        int[] humanities = new int[2];
        int sum = 0;
        
        for(int i = 0; i < naturalSeries.length; i++) {
            naturalSeries[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < humanities.length; i++) {
            humanities[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(naturalSeries);
        Arrays.sort(humanities);
        
        for(int i = 1; i < naturalSeries.length; i++)
            sum += naturalSeries[i];
        for(int i = 1; i < humanities.length; i++)
            sum += humanities[i];
        
        System.out.print(sum);
    }
}