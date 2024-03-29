import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N;
    static int[] A, cnt;
    
    static void input() {
        N = scan.nextInt();
        A = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
        cnt = new int[100000 + 1];
    }
    
    static void pro() {
        long answer = 0;
        
        for(int L = 1, R = 0; L <= N; L++) {
            while(R + 1 <= N && cnt[A[R + 1]] == 0) {
                R++;
                cnt[A[R]]++;
            }
            answer += R - L + 1;
            cnt[A[L]]--;
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
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}