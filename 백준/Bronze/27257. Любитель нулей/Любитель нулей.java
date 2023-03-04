import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String k = br.readLine();
        
        while(true) {
            if(k.charAt(k.length()-1) == '0') {
                k = k.substring(0, k.length()-1);
            } else {
                break;
            }
        }
        
        int cnt = 0;
        for(int i = 0; i < k.length(); i++) {
            if(k.charAt(i) == '0') cnt++;
        }
        System.out.print(cnt);
    }
}