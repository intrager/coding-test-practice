class Solution {
    public long solution(String numbers) {
        String[] numbersArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < numbersArr.length; i++) {
            if(numbers.contains(numbersArr[i])) {
                numbers = numbers.replaceAll(numbersArr[i], Long.toString(i));
            }
        }
        return Long.parseLong(numbers);
    }
}