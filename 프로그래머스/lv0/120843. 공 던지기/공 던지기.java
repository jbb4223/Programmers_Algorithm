class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 1;
        int index = 0;

        while(true) {
            if(k == count) {
                answer = numbers[index % numbers.length];
                break;
            }
            index += 2;
            count++;
        }

        return answer;
    }
}