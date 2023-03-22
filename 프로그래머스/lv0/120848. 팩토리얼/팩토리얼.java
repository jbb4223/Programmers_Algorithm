class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;
        int index = 1;

        do{
            index++;
            sum *= index;
            if(sum == n) {
                break;
            } else if (sum > n) {
                index--;
            }
        }
        while(n > sum);

        answer = index;

        return answer;
    }
}