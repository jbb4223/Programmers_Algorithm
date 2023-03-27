class Solution {
    public int solution(int[] sides) {
            int answer = 0;
            int side = 1;


            while (true) {
                // 배열안에 가장긴변수가 있는경우
                if(Math.max(sides[0],sides[1]) >= side) {
                    answer = answer + (Math.max(sides[0],sides[1]) < Math.min(sides[0],sides[1]) + side ?  1 : 0);
                } else if (Math.max(sides[0],sides[1]) < side) {
                    if(sides[0] + sides[1] == side) {
                        break;
                    }
                    answer = answer + (side < (sides[0] + sides[1]) ? 1 : 0);
                }
                side++;
            }

            return answer;
    }
}