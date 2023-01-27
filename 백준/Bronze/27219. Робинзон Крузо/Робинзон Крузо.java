import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int VCount = 0;
        if(n / 5 > 0) {
            VCount = n / 5;
        } 
        n %= 5;
        int ICount = n;
        for(int i = 0; i < VCount; i++) System.out.print("V");
        for(int i = 0; i < ICount; i++) System.out.print("I");
    }
}