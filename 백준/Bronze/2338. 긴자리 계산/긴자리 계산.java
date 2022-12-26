import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static BigInteger A, B;

    static void input() throws IOException {
        A = new BigInteger(scan.nextLine());
        B = new BigInteger(scan.nextLine());
    }

    static void pro() {
        String plus = A.add(B).toString();
        String minus = A.subtract(B).toString();
        String mul = A.multiply(B).toString();
        if(plus.length() > 1) plus.replace("[0]", "");
        if(minus.length() > 1) minus.replace("[0]", "");
        if(mul.length() > 1) mul.replace("[0]", "");
        sb.append(plus).append('\n');
        sb.append(minus).append('\n');
        sb.append(mul).append('\n');
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
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
            while (st == null || !st.hasMoreElements()) {
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