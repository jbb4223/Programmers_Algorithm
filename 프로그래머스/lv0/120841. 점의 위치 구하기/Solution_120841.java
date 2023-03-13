public class Solution_120841 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {12,10};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0] > 0) {
            if(dot[1] > 0) {
                answer = 1;
            } else {
                answer = 4;
            }
        } else {
            if(dot[1] > 0) {
                answer = 2;
            } else {
                answer = 3;
            }
        }
        
        return answer;
    }
}