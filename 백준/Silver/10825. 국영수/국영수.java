import java.io.*;
import java.util.*;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();
    
    static class Elem implements Comparable<Elem> {
        public String name;
        public int korean, english, math;
    
        @Override
        public int compareTo(Elem other) {
            // 국어 점수 내림차순
            if(korean != other.korean) return other.korean - korean; // 내가 가진 국어 점수와 비교하고자 하는 국어 점수
            // 영어 점수 오름차순
            if(english != other.english) return english - other.english;
            // 수학 점수 내림차순
            if(math != other.math) return other.math - math;
            // 이름 사전순(오름차순)
            return name.compareTo(other.name);
        }
    }
    
    static int N;
    static Elem[] a; // 학생들 정보 입력받는 배열
    
    static void input() {
        N = scan.nextInt();
        a = new Elem[N];
        for(int i = 0; i < N; i++) {
            a[i] = new Elem();
            a[i].name = scan.next();
            a[i].korean = scan.nextInt();
            a[i].english = scan.nextInt();
            a[i].math = scan.nextInt();
        }
    }
    
    static void pro() {
        // 기준을 통해 정렬하기
        Arrays.sort(a);
        
        // 정답 출력하기
        for(int i = 0; i < a.length; i++) {
            sb.append(a[i].name).append('\n');
        }
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