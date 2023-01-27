import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] mapleStory = br.readLine().split(" ");
        double a = Double.parseDouble(mapleStory[0]);
        double b = Double.parseDouble(mapleStory[1]);
        if((a * ((100-b)/100)) >= 100) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}