public class Solution_120830 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(1,2));
        System.out.println("=======================");
    }

    public static int solution(int n, int k) {
        int answer = 0;
        
        answer = (12000 * n) + (2000 * (k - n/10));
        
        return answer;
    }
}