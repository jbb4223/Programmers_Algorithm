class Solution {
    public int solution(int[] sides) {
            int answer = 0;
            int side = 1;
            int min = Math.min(sides[0],sides[1]);
            int max = Math.max(sides[0],sides[1]);


            while (true) {
                if(max >= side) {
                    answer = answer + (max < min + side ?  1 : 0);
                } else if (max < side) {
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