public class Solution_120815 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {4, 455, 6, 4, -1, 45, 6};
        System.out.println("=======================");
        System.out.println(solution(4));
        System.out.println("=======================");
    }

    public static int solution(int n) {
        int answer = 0;
        int piece = 1;

        while((n*piece) % 6 != 0) {
            piece++;
        }

        answer = (n*piece) / 6;

        return answer;
    }
}