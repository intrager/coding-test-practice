import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N;
    static int[][] Dy;
    static int[] A;
    
    static void input() {
        N = scan.nextInt();
        A = new int[N + 1];
        Dy = new int[N + 1][10];
    }
    
    static void pro() {
        for(int n = 0; n <= 9; n++) {
            Dy[1][n] = 1;
        }
        
        for(int len = 2; len <= N; len++) {
            for(int num = 0; num <= 9; num++) {
                for(int prev = 0; prev <= num; prev++) {
                    Dy[len][num] += Dy[len - 1][prev];
                    Dy[len][num] %= 10007;
                }
            }
        }
        
        int answer = 0;
        for(int num = 0; num <= 9; num++) {
            answer += Dy[N][num];
            answer %= 10007;
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