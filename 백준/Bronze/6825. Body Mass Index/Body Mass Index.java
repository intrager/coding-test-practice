import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double weight = Double.parseDouble(br.readLine());
        double height = Double.parseDouble(br.readLine());
        double BMI = weight / (height*height);
        if(BMI > 25) System.out.print("Overweight");
        else if(18.5<= BMI && BMI <= 25.0) System.out.print("Normal weight");
        else if(BMI < 18.5) System.out.print("Underweight");
    }
}