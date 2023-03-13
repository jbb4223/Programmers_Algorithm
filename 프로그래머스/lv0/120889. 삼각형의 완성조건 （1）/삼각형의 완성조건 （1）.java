class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int longSide = 0;   //가장 긴변
        int shortSum = 0; // 나머지 변의 합
        
        for(int i=0; i<sides.length; i++) {
            if(longSide < sides[i]) {
                longSide = sides[i];
            }
            shortSum += sides[i];
        }
        
        answer = (longSide < shortSum-longSide) ? 1 : 2;
        
        return answer;
    }
}