import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        System.out.print("The largest square has side length " + (int)(Math.floor(Math.sqrt(N))) + ".");
    }
}