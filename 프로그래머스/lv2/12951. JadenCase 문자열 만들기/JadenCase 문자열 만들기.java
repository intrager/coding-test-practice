class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuffer sf = new StringBuffer();
        s = s.toLowerCase();
        sf.append(Character.toUpperCase(s.charAt(0)));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ' ') sf.append(" ");
            else if(s.charAt(i - 1) == ' ') sf.append(Character.toUpperCase(s.charAt(i)));
            else sf.append(s.charAt(i));
        }
        return sf.toString();
    }
}