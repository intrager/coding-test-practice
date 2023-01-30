import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] participantsArr = br.readLine().split(" ");
        int participant = Integer.parseInt(participantsArr[0]) * Integer.parseInt(participantsArr[1]);
        
        String[] news = br.readLine().split(" ");
        int[] newsArr = new int[5];
        for(int i = 0; i < news.length; i++)
            newsArr[i] = Integer.parseInt(news[i]);
        
        for(int i = 0; i < newsArr.length - 1; i++) {
            System.out.print(newsArr[i] - participant + " ");
        }
        System.out.print(newsArr[newsArr.length-1] - participant);
    }
}