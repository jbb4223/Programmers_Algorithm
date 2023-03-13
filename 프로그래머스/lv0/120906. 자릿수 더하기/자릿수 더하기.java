class Solution {
    public int solution(int n) {
        int answer = 0;
        String anw;

        anw = Integer.toString(n);

        for(int i=0; i<anw.length(); i++) {
            answer += Integer.parseInt(String.valueOf(anw.charAt(i)));
        }


        return answer;
    }
}