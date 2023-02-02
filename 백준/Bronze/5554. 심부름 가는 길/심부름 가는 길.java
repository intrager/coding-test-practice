// 1. 집 -> 학교
// 2. 학교 -> PC방
// 3. PC방 -> 학원
// 4. 학원 -> 집
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int homeToSchool = Integer.parseInt(br.readLine());
        int schoolToPC = Integer.parseInt(br.readLine());
        int PCToAcademy = Integer.parseInt(br.readLine());
        int AcademyToHome = Integer.parseInt(br.readLine());
        
        int minute, second;
        second = homeToSchool + schoolToPC + PCToAcademy + AcademyToHome;
        minute = second/60;
        second %= 60;
        System.out.println(minute);
        System.out.print(second);
    }
}