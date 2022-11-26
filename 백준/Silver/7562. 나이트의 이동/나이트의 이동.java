import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N, nowx, nowy, gox, goy;
    static int[][] dist;
    static int[][] dir = {{-1, -2}, {-2, -1}, {-1, 2}, {-2, 1}, {1, -2}, {2, -1}, {1, 2}, {2, 1}};
    
    static void input() {
        N = scan.nextInt();
        nowx = scan.nextInt();
        nowy = scan.nextInt();
        gox = scan.nextInt();
        goy = scan.nextInt();
        dist = new int[N][N];
    }
    
    static int bfs() {
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                dist[i][j] = -1;
        
        Queue<Integer> que = new LinkedList<>();
        
        que.add(nowx);
        que.add(nowy);
        dist[nowx][nowy] = 0;
        
        while(!que.isEmpty()) {
            int x = que.poll();
            int y = que.poll();
            for(int k = 0; k < 8; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];
                if(nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                if(dist[nx][ny] != -1) continue;
                que.add(nx);
                que.add(ny);
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
        return dist[gox][goy];
    }
    
    static void pro() {
        System.out.println(bfs());
    }
    
    public static void main(String[] args) {
        int T = scan.nextInt();
        while(T-- > 0) {
            input();
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