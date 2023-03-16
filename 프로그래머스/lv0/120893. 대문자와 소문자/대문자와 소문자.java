class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char [] charArr = my_string.toCharArray();

        for(char c : charArr) {
            if(Character.isUpperCase(c)) {
                answer.append(String.valueOf(c).toLowerCase());
            } else {
                answer.append(String.valueOf(c).toUpperCase());
            }
        }

        return answer.toString();
    }
}