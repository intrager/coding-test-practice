import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] currentTime = br.readLine().split(" ");
        int A = Integer.parseInt(currentTime[0]);
        int B = Integer.parseInt(currentTime[1]);
        int C = Integer.parseInt(currentTime[2]);
        
        int cookingTime = Integer.parseInt(br.readLine());
        C += cookingTime;
        B += (C / 60);
        
        C %= 60;
        A += (B / 60);
        
        B %= 60;
        A %= 24;
        
        System.out.println(A + " " + B + " " + C);
    }
}