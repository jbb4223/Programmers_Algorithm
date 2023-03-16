class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char [] charArr = cipher.toCharArray();

        for(int i=code-1; i<charArr.length; i = i+code) {
            answer += charArr[i];
        }

        return answer;
    }
}