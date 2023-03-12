import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        /*
        n : 안토니오가 소유하고 있는 배의 수
        s : 하루당 배가 이동 가능한 마일 거리(속도)
        d : 만기일까지 남은 일수
        */
        int n, s, d;        
        int di, vi; // 베니스에서 선박까지의 거리, 선박의 하중 값(값을 수 있는 돈)
        int sum; // 값은 돈의 액수
        int k = 1; // 출력 인덱스 값
        while(T-- > 0) {
            sum = 0;
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken()); 
            d = Integer.parseInt(st.nextToken());
            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                di = Integer.parseInt(st.nextToken());
                vi = Integer.parseInt(st.nextToken());
                if(s*d >= di) sum += vi;
            }
            System.out.println("Data Set " + k++ + ":");
            System.out.println(sum);
            System.out.println();
        }
    }
}