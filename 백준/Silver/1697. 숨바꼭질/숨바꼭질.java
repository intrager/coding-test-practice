import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N, K;
    static int[] dist;
    static boolean[] visit;
    
    static void input() {
        N = scan.nextInt();
        K = scan.nextInt();
        dist = new int[N + 1];
        visit = new boolean[100005];
        dist = new int[100005];
    }
    
    static void bfs() {
        Queue<Integer> que = new LinkedList<>();       
        
        que.add(N);
        visit[N] = true;
        dist[N] = 0;
        
        while(!que.isEmpty()) {
            int x = que.poll();
            if(x - 1 >= 0 && x - 1 <= 100000 && !visit[x-1]) {
                visit[x-1] = true;
                dist[x - 1] = dist[x] + 1;
                que.add(x-1);
            }
            if(x + 1 >= 0 && x + 1 <= 100000 && !visit[x+1]) {
                visit[x+1] = true;
                dist[x + 1] = dist[x] + 1;
                que.add(x+1);
            }
            if(x*2 >= 0 && x*2 <= 100000 && !visit[x*2]) {
                visit[x*2] = true;
                dist[x*2] = dist[x] + 1;
                que.add(x*2);
            }
        }
    }
    
    static void pro() {
        bfs();
        System.out.println(dist[K]);
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