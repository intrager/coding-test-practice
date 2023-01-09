import java.util.ArrayList;

class Solution {
    public int solution(int[][] dots) {
        ArrayList<Double> list = new ArrayList<>();
        
        for(int i = 0; i < dots.length - 1; i++) {
            for(int j = i + 1; j < dots.length; j++) {
                double inclination = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                if(list.contains(inclination)) return 1;
                else list.add(inclination);
            }
        }
        return 0;
    }
}