import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 1. N을 입력받음
        int N = Integer.parseInt(br.readLine());
        // 2. N을 4로 나눈 몫 만큼 for문을 돌리면서
        // 3. int 옆에 long을 붙인다.
        for(int i = 0; i < N/4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}