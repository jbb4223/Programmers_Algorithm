public class Solution_120840 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3};
        System.out.println("=======================");
        System.out.println(solution(3,2));
        System.out.println("=======================");
    }

    public static int comb(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return solution((balls - 1), (share - 1)) + solution(balls - 1, share);
    }

    public static int solution(int balls, int share) {
        return comb(balls, share);
    }
}