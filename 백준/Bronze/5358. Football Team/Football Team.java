import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(br.ready()) {
            String[] malfunctionedName = br.readLine().split("");
            for(int i = 0; i < malfunctionedName.length; i++) {
                if(malfunctionedName[i].equals("i")) malfunctionedName[i] = "e";
                else if(malfunctionedName[i].equals("I")) malfunctionedName[i] = "E";
                else if(malfunctionedName[i].equals("e")) malfunctionedName[i] = "i";
                else if(malfunctionedName[i].equals("E")) malfunctionedName[i] = "I";
            }
            String str = String.join("", malfunctionedName);
            System.out.println(str);
        }
    }
}