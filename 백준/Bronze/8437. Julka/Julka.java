import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static void inputAndPro() {
        BigInteger count = new BigInteger(scan.nextLine());
        BigInteger num = new BigInteger(scan.nextLine());
        BigInteger two = new BigInteger("2");
        sb.append(((count.subtract(num)).divide(two)).add(num)).append('\n');
        sb.append((count.subtract(num)).divide(two));
    }

    public static void main(String[] args) {
        inputAndPro();
        System.out.println(sb);
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