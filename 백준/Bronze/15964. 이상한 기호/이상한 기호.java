import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] arrForInput = br.readLine().split(" ");
        int A = Integer.parseInt(arrForInput[0]);
        int B = Integer.parseInt(arrForInput[1]);
        bw.write(at(A, B).toString());
        bw.flush();
        bw.close();
    }
    
    private static Integer at(int a, int b) {
        return (a+b) * (a-b);
    }
}