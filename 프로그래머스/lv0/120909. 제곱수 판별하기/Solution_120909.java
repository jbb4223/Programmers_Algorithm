public class Solution_120909 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(976));
        System.out.println("=======================");
    }

    public static int solution(int n) {
        int answer = 0;
        int root;

        root = (int)Math.sqrt(n);

        answer =  n == root * root ? 1 : 2;

        return answer;
    }
}