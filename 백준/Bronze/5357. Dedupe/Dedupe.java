import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            String dedupedString = br.readLine();
            bw.write(dedupedString.charAt(0));
            for(int i = 1; i < dedupedString.length(); i++) {
                if(dedupedString.charAt(i - 1) == dedupedString.charAt(i)) {
                    continue;
                } 
                bw.write(dedupedString.charAt(i));
            }
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}