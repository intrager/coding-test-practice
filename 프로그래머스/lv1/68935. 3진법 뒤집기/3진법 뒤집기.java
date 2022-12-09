class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = n;
        int temp = 0;
        StringBuffer sf = new StringBuffer();
        while(num > 0) {
            temp = num % 3;
            num /= 3;
            sf.append(temp);
        }
        sf.reverse();
        for(int i = sf.length() -1; i >= 0 ; i--) {
            if(sf.charAt(i) - '0' != 48)
                answer += (sf.charAt(i) - '0') * (Math.pow(3, i));
        }
        return answer;
    }
}