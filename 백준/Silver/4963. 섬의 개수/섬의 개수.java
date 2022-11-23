import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int w, h;
    static int[][] A;
    static boolean[][] visit;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    
    static void input() {
        h = scan.nextInt(); 
        w = scan.nextInt();
        A = new int[w][h];
        for(int i = 0; i < w; i++) {
            for(int j = 0; j < h; j++) {
                A[i][j] = scan.nextInt();
            }
        }
        visit = new boolean[w][h];
    }
    
    static void dfs(int x, int y) {
        visit[x][y] = true;
        for(int k = 0; k < 8; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if(nx < 0 || ny < 0 || nx >= w || ny >= h) continue;
            if(A[nx][ny] == 0) continue;
            if(visit[nx][ny]) continue;
            dfs(nx, ny);
        }
    }
    
    static void pro() {
        int cnt = 0;
        for(int i = 0; i < w; i++) {
            for(int j = 0; j < h; j++) {
                if(!visit[i][j] && A[i][j] == 1) {
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        System.out.println(cnt);
    }
    
    public static void main(String[] args) {
        while(true) {
            input();
            if(w == 0 && h == 0) break;
            pro();
        }
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