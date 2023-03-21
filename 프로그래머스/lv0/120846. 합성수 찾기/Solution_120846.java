public class Solution_120846 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(15));
        System.out.println("=======================");
    }

    public static int solution(int n) {
        int answer = 0;
        int check;
        
        for(int i=1; i<=n; i++) {
            check = 0;
            for(int j=1; j<=i; j++) {
                if(i%j == 0) {
                    check += 1;
                }
            }
            if(check >= 3)
                answer +=1;
        }
        return answer;
    }
}