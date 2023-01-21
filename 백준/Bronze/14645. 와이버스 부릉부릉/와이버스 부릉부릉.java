import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(br.ready()) {
            String[] passengers = br.readLine().split(" ");
            int A = Integer.parseInt(passengers[0]);
            int B = Integer.parseInt(passengers[1]);
        }
        System.out.println("비와이");
    }
}