import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        
        int[] alphabet = new int[26];
        for(int i = 0; i < S.length(); i++) {
            alphabet[(int)S.charAt(i) - 97]++;
        }
        for(int a : alphabet) {
            System.out.print(a + " ");
        }
    }
}