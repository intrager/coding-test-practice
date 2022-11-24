import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N, M;
    static ArrayList<Integer>[] adj;
    static boolean[] infect;
    
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
        for(int i = 1; i <= N; i++)
            Collections.sort(adj[i]);
    }
    
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        que.add(start);
        infect[start] = true;
        
        while(!que.isEmpty()) {
            int x = que.poll();
            for(int y: adj[x]) {
                if(infect[y]) continue;
                que.add(y);
                infect[y] = true;
            }
        }
    }
    
    static void pro() {
        infect = new boolean[N + 1];
        bfs(1);
        int cnt = 0;
        for(int i = 2; i <= N; i++)
            if(infect[i]) cnt++;
        System.out.println(cnt);
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