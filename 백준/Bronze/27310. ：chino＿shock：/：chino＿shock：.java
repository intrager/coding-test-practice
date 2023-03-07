import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String chino = br.readLine();
        int length = chino.length();
        final int colon = 2;
        int count = 0;
        for(int i = 0; i < chino.length(); i++) {
            if(chino.charAt(i) == '_') count++;
        }
        System.out.print(length + colon + count*5);
    }
}