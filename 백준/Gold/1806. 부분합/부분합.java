import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static FastReader scan = new FastReader();
    
    static int N, S;
    static int[] a;
    
    static void input() {
        N = scan.nextInt();
        S = scan.nextInt();
        a = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            a[i] = scan.nextInt();
        }
    }
    
    static void pro() {
        int R = 0, sum = 0, answer = N + 1;
        for(int L = 1; L <= N; L++) {
            sum -= a[L - 1];
            while(R + 1 <= N && sum < S) sum += a[++R];
            if(sum >= S) answer = Math.min(answer, R - L + 1);
        }
        if(answer == N + 1) answer = 0;
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