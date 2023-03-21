class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int size = 0;

        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                size +=1;
            }
        }

        answer = new int[size];

        for(int i=1,j=0; i<=n; i++) {
            if(n % i == 0) {
                answer[j] = i;
                j++;
            }
        }

        return answer;
    }
}