public class Solution_120868 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {3, 6};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static int solution(int[] sides) {
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