import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N;
    static int[][] adj;
    static boolean[] connect;
    
    static void input() {
        N = scan.nextInt();
        adj = new int[N + 1][N + 1];
        for(int i = 1; i <= N; i++)
            for(int j = 1; j <= N; j++)
                adj[i][j] = scan.nextInt();
    }
    
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 1; i <= N; i++)
            connect[i] = false;
        
        que.add(start);
        connect[start] = false;
        
        while(!que.isEmpty()) {
            int x = que.poll();
            
            for(int y = 1; y <= N; y++) {
                if(adj[x][y] == 0) continue;
                if(connect[y]) continue;
                
                que.add(y);
                connect[y] = true;
            }
        }
        for(int i = 1; i <= N; i++) {
            if(connect[i]) sb.append('1').append(' ');
            else sb.append('0').append(' ');
        }
        sb.append('\n');        
    }
    
    static void pro() {
        connect = new boolean[N + 1];
        for(int i = 1; i <= N; i++)
            bfs(i);
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