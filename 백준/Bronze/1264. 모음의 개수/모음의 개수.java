import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String lines = br.readLine().toLowerCase();
        int count = 0;
        while(!lines.equals("#")) {
            count = 0;
            for(int i = 0; i < lines.length(); i++) {
                switch (lines.charAt(i)) {
                    case 'a': 
                    case 'e': 
                    case 'i': 
                    case 'o': 
                    case 'u':
                        count++;
                        break;
                    default:
                        break;
                }
            }
            System.out.println(count);
            lines = br.readLine().toLowerCase();
        }
    }
}