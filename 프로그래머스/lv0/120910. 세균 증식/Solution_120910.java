public class Solution_120910 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(2,10));
        System.out.println("=======================");
    }

    public static int solution(int n, int t) {
        int answer = 0;

        for(int i=0; i<t; i++) {
            n = n*2;
        }

        answer = n;
        return answer;
    }
}