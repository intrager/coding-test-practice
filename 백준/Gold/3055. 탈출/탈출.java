import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int R, C;
    static String[] A;
    static int[][] dist_water, dist_hedgehog;
    static boolean[][] visit;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static ArrayList<Integer> group;
    
    static void input() {
        R = scan.nextInt();
        C = scan.nextInt();
        A = new String[R];
        for(int i = 0; i < R; i++)
            A[i] = scan.nextLine();
        visit = new boolean[R][C];
        dist_water = new int[R][C];
        dist_hedgehog = new int[R][C];
    }
    
    static void bfs_water() {
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                dist_water[i][j] = -1;
                visit[i][j] = false;
                if(A[i].charAt(j) == '*') {
                    que.add(i);
                    que.add(j);
                    dist_water[i][j] = 0;
                    visit[i][j] = true;
                }
            }
        }
        
        while(!que.isEmpty()) {
            int x = que.poll();
            int y = que.poll();
            for(int k = 0; k < 4; k++) {
                int nx = x + dir[k][0];
                int ny = y + dir[k][1];
                if(nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if(A[nx].charAt(ny) != '.') continue;
                if(visit[nx][ny]) continue;
                que.add(nx);
                que.add(ny);
                visit[nx][ny] = true;
                dist_water[nx][ny] = dist_water[x][y] + 1;
            }
        }
    }
    
    static void bfs_hedgehog() {
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                dist_hedgehog[i][j] = -1;
                visit[i][j] = false;
                if(A[i].charAt(j) == 'S') {
                    que.add(i);
                    que.add(j);
                    dist_hedgehog[i][j] = 0;
                    visit[i][j] = true;
                }
            }
        }
        
        while(!que.isEmpty()) {
            int x = que.poll();
            int y = que.poll();
            for(int k = 0; k < 4; k++) {
                int nx = x + dir[k][0], ny = y + dir[k][1];
                if(nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
                if(A[nx].charAt(ny) != '.' && A[nx].charAt(ny) != 'D') continue;
                if(dist_water[nx][ny] != -1 && dist_water[nx][ny] <= dist_hedgehog[x][y] + 1) continue;
                if(visit[nx][ny]) continue;
                que.add(nx);
                que.add(ny);
                visit[nx][ny] = true;
                dist_hedgehog[nx][ny] = dist_hedgehog[x][y] + 1;
            }
        }
    }
    
    static void pro() {
        bfs_water();
        bfs_hedgehog();
        
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(A[i].charAt(j) == 'D') {
                    if(dist_hedgehog[i][j] == -1) System.out.println("KAKTUS");
                    else System.out.println(dist_hedgehog[i][j]);
                }
            }
        }
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
                } catch (IOException e){
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