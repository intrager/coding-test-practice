import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static FastReader scan = new FastReader();
    
    static int N, K;
    static int[] A;
    
    static void input() {
        N = scan.nextInt();
        K = scan.nextInt();
        A = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
    }
    
    static void pro() {
        int R = 0, answer = -1, sum = 0;
        for(int L = 1; L <= N; L++) {   
            while (R < N && sum < K) {
                R++;
                if(A[R] == 1) sum++;
            }
        
            if(sum == K) {
                if(answer == -1) answer = R - L + 1;
                answer = Math.min(answer, R - L + 1);
            }
            if(A[L] == 1) sum--;
        }
        
        System.out.println(answer);
    }
    
    public static void main(String[] args) {
        input();
        pro();
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }
        
        String next() {
            while(st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDoulbe() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch(IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}