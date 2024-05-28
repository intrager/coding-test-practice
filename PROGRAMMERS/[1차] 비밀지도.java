class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
​
        for(int i=0; i<arr1.length; i++){
            String str = Integer.toBinaryString(arr1[i]);
​
            for(int j=0; j<str.length(); j++){
                if(answer[i] == null) answer[i] = "";
​
                if(str.charAt(j) == '1'){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
        }
​
        for(int i=0; i<arr2.length; i++){
            String str = "";
            String ans = "";
​
            if(answer[i].length() < n){
                for(int k=0; k<n-answer[i].length(); k++){
                    ans += " ";
                }
            }
​
            if((Integer.toBinaryString(arr2[i])).length() < n){
                for(int k=0; k<n-(Integer.toBinaryString(arr2[i])).length(); k++){
                    str += " ";
                }
            }
​
            ans += answer[i];
            answer[i] = "";
            str += Integer.toBinaryString(arr2[i]);
​
            for(int j=0; j<str.length(); j++){
                if((str.charAt(j) == '1') || (ans.charAt(j) != ' ')){
                    answer[i] += "#";
                }else{
                    answer[i] += " ";
                }
            }
        }
​
​
        return answer;
    }
}