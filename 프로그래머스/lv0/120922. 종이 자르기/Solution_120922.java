public class Solution_120922 {

    public static void main(String[] args) {
        // 예시
        String [] arr = {"left", "left", "left", "left", "right", "right", "right", "right"};
//            int [] arr2 = {5, 5};
        System.out.println("=======================");
        System.out.println(solution(2, 5));
        System.out.println("=======================");
    }

    public static int solution(int M, int N) {
            int answer = 0;

            answer = (M-1) + M * (N-1);

            return answer;
    }
}