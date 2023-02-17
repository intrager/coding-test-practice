import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String password = br.readLine();
        StringBuilder sb = new StringBuilder();
        
        while(!password.equals("END")) {
            for(char pw : password.toCharArray()) {
                sb.append(pw);
            }
            System.out.println(sb.reverse());
            
            sb = new StringBuilder();
            password = br.readLine();
        }
    }
}