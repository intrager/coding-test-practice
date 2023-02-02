import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] s = br.readLine().split(" ");
        String[] t = br.readLine().split(" ");
        
        int S = Integer.parseInt(s[0]) + 
            Integer.parseInt(s[1]) + 
            Integer.parseInt(s[2]) +
            Integer.parseInt(s[3]);
        int T = Integer.parseInt(t[0]) + 
            Integer.parseInt(t[1]) + 
            Integer.parseInt(t[2]) + 
            Integer.parseInt(t[3]);
        if(S >= T) System.out.print(S);
        else System.out.print(T);
    }
}