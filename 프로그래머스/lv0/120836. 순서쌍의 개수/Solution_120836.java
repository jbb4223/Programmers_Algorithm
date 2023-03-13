public class Solution_120836 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(20));
        System.out.println("=======================");
    }

    public static int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            if(n % i == 0)  {
                answer += 1;
            }
        }
        
        return answer;
    }
}