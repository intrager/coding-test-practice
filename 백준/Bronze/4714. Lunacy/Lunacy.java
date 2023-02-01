import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double X = Double.parseDouble(br.readLine());
        while(X != -1.0) {
            System.out.println("Objects weighing " + String.format("%.2f", X) + " on Earth will weigh " + String.format("%.2f", X * 0.167) + " on the moon.");
            X = Double.parseDouble(br.readLine());
        }
    }
}