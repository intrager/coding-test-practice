import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static FastReader scan = new FastReader();
    
    static int N, x;
    static int[] A;
    
    static void input() {
        N = scan.nextInt();
        A = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
        Arrays.sort(A, 1, N + 1);
        x = scan.nextInt();
    }
    
    static void pro() {
        int answer = 0, L = 1, R = N;
        while(L < R) {
            if(A[L] + A[R] == x) answer++;
            if(A[L] + A[R] >= x) R--;
            else L++;
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