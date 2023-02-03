import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int limit = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        int standard = speed - limit;
        if(standard <= 0) {
            System.out.print("Congratulations, you are within the speed limit!");
        } else {
            if(standard <= 20) {
                System.out.print("You are speeding and your fine is $100.");
            } else if(standard <= 30) {
                System.out.print("You are speeding and your fine is $270.");
            } else {
                System.out.print("You are speeding and your fine is $500.");
            }
        }
    }
}