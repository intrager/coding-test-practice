import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;
        while(br.ready()) {
            count++;
            br.readLine();
        }
        System.out.println(count);
    }
}