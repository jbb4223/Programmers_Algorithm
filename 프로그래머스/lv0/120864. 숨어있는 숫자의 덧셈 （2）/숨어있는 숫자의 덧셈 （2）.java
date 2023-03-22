class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String [] arr = my_string.split("[a-zA-z]+");

        for(String s : arr) {
            answer += s.equals("") ? 0 : Integer.parseInt(s);
        }

        return answer;
    }
}