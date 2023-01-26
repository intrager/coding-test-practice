import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        long A = Long.parseLong(br.readLine());
        long B = Long.parseLong(br.readLine());
        System.out.println(A*B);
    }
}