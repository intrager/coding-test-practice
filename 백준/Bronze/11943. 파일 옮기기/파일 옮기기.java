import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] firstBasket = new int[2];
        int[] secondBasket = new int[2];
        
        firstBasket[0] = Integer.parseInt(st.nextToken());
        firstBasket[1] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        secondBasket[0] = Integer.parseInt(st.nextToken());
        secondBasket[1] = Integer.parseInt(st.nextToken());
        
        int sumA = 0, sumB = 0;
        sumA += secondBasket[1] + firstBasket[0];
        sumB += secondBasket[0] + firstBasket[1];
        System.out.print(Math.min(sumA, sumB));
    }
}