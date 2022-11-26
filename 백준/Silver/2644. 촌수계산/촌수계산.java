import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N, one, two, degree;
    static ArrayList<Integer>[] adj;
    static int[] count;
    
    static void input() {
        N = scan.nextInt();
        one = scan.nextInt();
        two = scan.nextInt();
        degree = scan.nextInt();
        adj = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++)
            adj[i] = new ArrayList<>();
        for(int i = 0; i < degree; i++) {
            int x = scan.nextInt(), y = scan.nextInt();
            adj[x].add(y);
            adj[y].add(x);
        }
    }
    
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i <= N; i++)
            count[i] = -1;
        
        que.add(start);
        count[start] = 0;
        
        while(!que.isEmpty()) {
            int x = que.poll();
            for(int y : adj[x]) {
                if(count[y] != -1) continue;
                que.add(y);
                count[y] = count[x] + 1;
            }
        }
    }
    
    static void pro() {
        count = new int[N + 1];
        bfs(one);
        System.out.println(count[two]);
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