class Solution {
    public long solution(String numbers) {
            String answer = "";

            String num = "";
            String [] numArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

            for(int i=0; i<numbers.length(); i++) {
                num += numbers.charAt(i);
                for(int j=0; j< numArr.length; j++) {
                    if(num.equals(numArr[j])) {
                        answer += j;
                        num = "";
                    }
                }
            }

            return Long.parseLong(answer);
    }
}