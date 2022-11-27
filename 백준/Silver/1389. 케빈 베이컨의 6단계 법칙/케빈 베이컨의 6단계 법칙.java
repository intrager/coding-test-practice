import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N, M;
    static ArrayList<Integer>[] adj;
    static int[] dist;
    
    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        adj = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++)
            adj[i] = new ArrayList<>();
        for(int i = 0; i < M; i++) {
            int x = scan.nextInt(), y = scan.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
        dist = new int[N + 1];
    }
    
    static int bfs(int start) {
        int ret = 0;
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= N; i++)
            dist[i] = -1;
        
        que.add(start);
        dist[start] = 0;
        
        while(!que.isEmpty()) {
            int x = que.poll();
            ret += dist[x];
            for(int y : adj[x]) {
                if(dist[y] != -1) continue;
                
                que.add(y);
                dist[y] = dist[x] + 1;
            }
        }
        return ret;
    }
    
    static void pro() {
        int min = bfs(1), minIdx = 1;
        for(int i = 2; i <= N; i++) {
            if(min > bfs(i)) {
                min = bfs(i);
                minIdx = i;
            }
        }
        System.out.println(minIdx);
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