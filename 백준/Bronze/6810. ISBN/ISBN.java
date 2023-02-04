import java.io.*;

public class Main {
    
    private static String ISBN = "9780921418";
    private static int ISBNDigit = 3;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        for(int i = 0; i < ISBN.length(); i++) {
            sum += Character.getNumericValue(ISBN.charAt(i)) * checkDigit();
        }
        for(int i = 0; i < 3; i++) {
            sum += Integer.parseInt(br.readLine()) * checkDigit();
        }
        System.out.print("The 1-3-sum is " + sum);
    }
    
    private static int checkDigit() {
        if(ISBNDigit == 1) {
            ISBNDigit = 3;
        } else {
            ISBNDigit = 1;
        }
        return ISBNDigit;
    }
}