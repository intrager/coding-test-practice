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
        Dy = new int[N + 1][2];
        for(int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
    }
    
    static void pro() {
        Dy[1][0] = 0;
        Dy[1][1] = A[1];
        
        if(N >= 2) {
            Dy[2][0] = A[2];
            Dy[2][1] = A[1] + A[2];
        }
        
        for(int i = 3; i <= N; i++) {
            Dy[i][0] = Math.max(Dy[i-2][0] + A[i], Dy[i-2][1] + A[i]);
            Dy[i][1] = Dy[i-1][0] + A[i];
        }
        
        int answer = Math.max(Dy[N][0], Dy[N][1]);
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