import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] equality = br.readLine().split(" ");
        int a = Integer.parseInt(equality[0]);
        int b = Integer.parseInt(equality[2]);
        int c = Integer.parseInt(equality[4]);
        
        if(a + b == c)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}