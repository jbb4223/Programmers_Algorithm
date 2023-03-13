public class Solution_120831 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(2));
        System.out.println("=======================");
    }

    public static int solution(int n) {
        int answer = 0;
        
        for(int a = 0; a <= n; a++) {
            if(a % 2 == 0) {
                answer += a;
            }
        }
        
        return answer;
    }
}