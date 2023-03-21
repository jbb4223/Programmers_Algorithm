class Solution {
    public int solution(int order) {
        int answer = 0;
        String [] arr = String.valueOf(order).split("");

        for(String s : arr) {
            if(s.equals("3") || s.equals("6") || s.equals("9")) {
                answer += 1;
            }
        }


        return answer;
    }
}