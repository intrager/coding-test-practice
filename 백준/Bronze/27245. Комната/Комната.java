import java.io.*;
    
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int w = Integer.parseInt(br.readLine()); // 너비
        int l = Integer.parseInt(br.readLine()); // 길이
        int h = Integer.parseInt(br.readLine()); // 높이
        
        int smaller = w < l ? w : l;
        int larger = w > l ? w : l;
        
        System.out.print(larger <= smaller*2 && smaller >= 2*h ? "good" : "bad");
    }
}