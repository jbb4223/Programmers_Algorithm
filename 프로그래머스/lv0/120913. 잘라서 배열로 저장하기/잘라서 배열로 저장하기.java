class Solution {
    public String[] solution(String my_str, int n) {
            String[] answer = new String[(my_str.length() / n) + ((my_str.length() % n) == 0 ? 0 : 1)];

            for(int i=0; i < answer.length; i++) {
                answer[i] = my_str.substring(i*n , i == answer.length - 1 ? my_str.length() : ((i+1) * n));
            }

            return answer;
    }
}