import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static int N;
    static ArrayList<Integer>[] a; // 색깔마다 점을 모을 ArrayList배열
    
    static void input() {
        N = scan.nextInt();
        a = new ArrayList[N+1];
        for(int color = 1; color <= N; color++) {
            a[color] = new ArrayList<Integer>();
        } // 입력받음
        for(int i = 1; i <= N; i++) {
            int coord, color;
            coord = scan.nextInt();
            color = scan.nextInt();
            a[color].add(coord); // a[color]에다가 coord라는 점의 위치가 있더라
        }
    }
    
    static int toLeft(int color, int idx) {
        // 색깔이 color인 점의 idx번째에 있는 점이 왼쪽으로 화살표를 그린다면
        // 화살표의 길이를 return하는 함수. 왼쪽에 점이 없다면 무한대를 return
        if(idx == 0) return Integer.MAX_VALUE;
        return a[color].get(idx) - a[color].get(idx - 1);
    }
    
    static int toRight(int color, int idx) {
        // 색깔이 color인 점의 idx번째에 있는 점이 오른쪽으로 화살표를 그린다면
        // 화살표의 길이를 return하는 함수. 오른쪽에 점이 없다면 무한대를 return
        if(idx + 1== a[color].size()) return Integer.MAX_VALUE; // 오른쪽에 있는 점이 color를 갖는 색의 개수와 동일하다면 
        return a[color].get(idx + 1) - a[color].get(idx); //idx+1번지 값에서 자신의 값을 뺌
    }
    
    static void pro() {
        for(int color = 1; color <= N; color++) {
            Collections.sort(a[color]); // 오름차순 정렬
        }
        int ans = 0; // 정답 카운트
        for(int color = 1; color <= N; color++) {
            for(int i = 0; i < a[color].size(); i++) { // 왼/오 중에 가까운 게 뭐냐
                int left = toLeft(color, i); //지금 보고 있는 색에 지금 인덱스 값
                int right = toRight(color, i);
                ans += Math.min(left, right);
            }
        }
        // 정답출력
        System.out.println(ans);
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