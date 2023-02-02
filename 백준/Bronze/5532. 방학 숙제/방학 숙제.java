import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int L = Integer.parseInt(br.readLine()); // 방학
        int A = Integer.parseInt(br.readLine()); // 국어
        int B = Integer.parseInt(br.readLine()); // 수학
        int C = Integer.parseInt(br.readLine()); // 하루 최대 국어
        int D = Integer.parseInt(br.readLine()); // 하루 최대 수학
        
        int korean, math;
        if(A % C == 0) {
            korean = A/C;
        } else {
            korean = A/C + 1;
        }
        if(B % D == 0) {
            math = B/D;
        } else {
            math = B/D + 1;
        }
        System.out.println(L - Math.max(korean, math));
    }
}