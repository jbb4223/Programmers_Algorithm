class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String anw;

        anw = my_string.replaceAll("[^\\d]", "");

        for(int i=0; i<anw.length(); i++) {
            answer += Integer.parseInt(String.valueOf(anw.charAt(i)));
        }


        return answer;
    }
}