class Solution {
    public int solution(int n) {
        int answer = 0;
        int check;
        
        for(int i=1; i<=n; i++) {
            check = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    check += 1;
                }
            }
            if(check >= 3)
                answer +=1;
        }
        return answer;
    }
}