import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] hangul = br.readLine().toCharArray();
        System.out.print((int)hangul[0] - 44031);
    }
}