import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] checkForBits = br.readLine().split(" ");
        for(String bit : checkForBits) {
            if(bit.equals("9")) {
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
}