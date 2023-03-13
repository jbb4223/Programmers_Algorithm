public class Solution_120831 {
    public int solution(int n) {
        int answer = 0;
        
        for(int a = 0; a <= n; a++) {
            if(a % 2 == 0) {
                answer += a;
            }
        }
        
        return answer;
    }
}