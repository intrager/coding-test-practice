import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arrForInput = br.readLine().split(" ");
        int A = Integer.parseInt(arrForInput[0]);
        int B = Integer.parseInt(arrForInput[1]);
        System.out.println((B-A) + " " + B);
    }
    // (B - A) / B == restcheese
    // if()
}