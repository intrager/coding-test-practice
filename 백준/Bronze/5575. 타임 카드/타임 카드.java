import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int onHour, onMinute, onSecond, offHour, offMinute, offSecond, h, m, s;
        while(br.ready()) {
            String[] time = br.readLine().split(" ");

            onHour = Integer.parseInt(time[0]);
            onMinute = Integer.parseInt(time[1]);
            onSecond = Integer.parseInt(time[2]);
            offHour = Integer.parseInt(time[3]);
            offMinute = Integer.parseInt(time[4]);
            offSecond = Integer.parseInt(time[5]);
            
            if(offSecond - onSecond < 0) { // 1분 땡겨와야 함
                s = 60 + (offSecond - onSecond);
                if(offMinute - onMinute -1 < 0) { // 1분 땡겼으니 1분 더 뺌, 근데 시간도 1시간 땡겨와야 함
                    m = 60 + (offMinute - onMinute) - 1;
                    h = offHour - onHour - 1;
                } else { // 1분 더 땡겼는데 0이상이어서 시간에서 땡길 필요 없을 때
                    m = offMinute - onMinute - 1;
                    h = offHour - onHour;
                }
            } else { // 1분 더 안 땡겨도 됨
                s = offSecond - onSecond;
                if(offMinute - onMinute < 0) { // 다만, 분에서 시간을 땡겨와야 할 때
                    m = 60 + (offMinute - onMinute);
                    h = offHour - onHour - 1;
                } else { // 스무스하게 시간을 땡길 필요 없는 경우
                    m = offMinute - onMinute;
                    h = offHour - onHour;
                }
            }
            if(br.ready())
                System.out.println(h + " " + m + " " + s);
            else 
                System.out.print(h + " " + m + " " + s);
        }
    }
}