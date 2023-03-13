public class Solution_120817 {

    public static void main(String[] args) {
        // 예시
        int[] arr = {0,1,2,1,1,1};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        for(int i=0; i < numbers.length; i++) {
           sum += numbers[i];
        }
        
        answer = (double)sum / numbers.length;
         
        return answer;
    }
}