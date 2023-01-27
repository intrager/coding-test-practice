import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 1. 경쟁사 가성비 구하기
        String[] competitorAndWarboyPrice = br.readLine().split(" ");
        int A = Integer.parseInt(competitorAndWarboyPrice[0]);
        int B = Integer.parseInt(competitorAndWarboyPrice[1]);
        int competitorValue = B / A;
        // 2. warboy 가성비 구하기
        int warboyValue = competitorValue * 3;
        // 3. warboy 가성비 * warboy 가격 = 성능
        int C = Integer.parseInt(competitorAndWarboyPrice[2]);
        int performance = warboyValue * C;
        System.out.println(performance);
    }
}