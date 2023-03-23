class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s = "";

        for(int a : array) {
            s += a;
        }

        answer = s.replaceAll("[^7]", "").length();

        return answer;
    }
}