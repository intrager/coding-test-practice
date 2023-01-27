import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1. N을 입력받는다.
        int N = Integer.parseInt(br.readLine());
        // 2. N을 테케로 while문을 돌리면서
        while(N-- > 0) {
            // 3. 입력받은 비밀번호가 올바른지 판단한다. Yes or No
            String password = br.readLine();
            if(6 <= password.length() && password.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}