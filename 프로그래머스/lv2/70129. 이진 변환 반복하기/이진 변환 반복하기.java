class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String arr = s.substring(0);
        Integer arrLen = 0;
        int cnt = 0;
        int zeroCnt = 0;
        
        while(!arr.equals("1")) {
            zeroCnt += arr.replaceAll("[1]","").length();
            
            arr = arr.replaceAll("[0]","");
            
            arrLen = arr.length();
            arr = Integer.toBinaryString(arrLen);
            
            cnt++;
        }
        answer[0] = cnt; 
        answer[1] = zeroCnt;
        return answer;
    }
}