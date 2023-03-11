import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int[] tempo = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            tempo[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(tempo);
        if(tempo[0] == tempo[1] || tempo[1] == tempo[2] || tempo[0] + tempo[1] == tempo[2]) System.out.print("S");
        else System.out.print("N");
    }
}