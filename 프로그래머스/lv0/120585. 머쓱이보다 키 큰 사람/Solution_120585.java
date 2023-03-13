public class Solution_120585 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {0,12,22,13,5,1};
        System.out.println("=======================");
        System.out.println(solution(arr,2));
        System.out.println("=======================");
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        
        for(int h : array) {
            if(height < h) {
                answer += 1;
            }
        }
        
        return answer;
    }
}