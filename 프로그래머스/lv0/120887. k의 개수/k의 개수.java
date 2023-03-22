class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String s = "";
        String [] arr;

        for(int a = i; a<=j; a++) {
            s += a;
        }

        arr = s.split("");

        for(String an : arr) {
            if(an.equals(String.valueOf(k))) {
                answer += 1;
            }
        }

        return answer;
    }
}