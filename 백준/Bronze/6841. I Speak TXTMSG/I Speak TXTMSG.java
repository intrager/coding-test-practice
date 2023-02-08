import java.io.*;
import java.util.*;

public class Main {
    
    static Map<String, String> map = new HashMap<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map.put("CU", "see you");
        map.put(":-)", "I’m happy");
        map.put(":-(", "I’m unhappy");
        map.put(";-)", "wink");
        map.put(":-P", "stick out my tongue");
        map.put("(~.~)", "sleepy");
        map.put("TA", "totally awesome");
        map.put("CCC", "Canadian Computing Competition");
        map.put("CUZ", "because");
        map.put("TY", "thank-you");
        map.put("YW", "you’re welcome");
        map.put("TTYL", "talk to you later");
        
        
        while(br.ready()) {
            String txtmsg = br.readLine().trim();
            String str = map.getOrDefault(txtmsg, txtmsg);
            System.out.println(str);
            if(txtmsg.equals("TTYL") || str.equals("talk to you later")) break;
        }
    }
}