import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double x = Double.parseDouble(br.readLine()) * 1.609344;
        System.out.printf("%.6f", (100/x)*3.785411784);
    }
}
