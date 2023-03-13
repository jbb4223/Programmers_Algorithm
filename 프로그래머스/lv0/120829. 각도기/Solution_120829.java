public class Solution_120829 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution(95));
        System.out.println("=======================");
    }

    public static int solution(int angle) {
        int answer = 0;
        
        if(angle < 90) {
            answer = 1;
        } else if(angle == 90) {
            answer = 2;
        } else if(angle > 90 && angle < 180) {
            answer = 3;
        } else if(angle == 180){
            answer = 4;
        }
        
        return answer;
    }
}