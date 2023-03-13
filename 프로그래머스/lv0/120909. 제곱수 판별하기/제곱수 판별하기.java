class Solution {
    public int solution(int n) {
        int answer = 0;
        int root;

        root = (int)Math.sqrt(n);

        answer =  n == root * root ? 1 : 2;

        return answer;
    }
}