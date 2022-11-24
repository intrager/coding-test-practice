import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int R, C, totalSheep, sheep, totalWolf, wolf;
    static String[] A;
    static boolean[][] visit;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    
    static void input() {
        R = scan.nextInt();
        C = scan.nextInt();
        A = new String[R];
        for(int i = 0; i < R; i++) 
            A[i] = scan.nextLine();
        visit = new boolean[R][C];
    }
    
    static void dfs(int x, int y) {
        visit[x][y] = true;
        if(A[x].charAt(y) == 'o') sheep++;
        if(A[x].charAt(y) == 'v') wolf++;
        for(int k = 0; k < 4; k++) {
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            if(nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
            if(A[nx].charAt(ny) == '#') continue;
            if(visit[nx][ny]) continue;
            dfs(nx, ny);
        }
    }
    
    static void pro() {
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(!visit[i][j] && A[i].charAt(j) != '#') {
                    sheep = 0; wolf = 0;
                    dfs(i, j);
                    if(sheep > wolf) totalSheep += sheep; 
                    else totalWolf += wolf;
                }
            }
        }
        sb.append(totalSheep).append(' ').append(totalWolf);
        System.out.println(sb.toString());
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