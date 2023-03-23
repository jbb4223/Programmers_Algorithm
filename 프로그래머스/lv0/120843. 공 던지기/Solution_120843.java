public class Solution_120843 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3};
        System.out.println("=======================");
        System.out.println(solution(arr, 3));
        System.out.println("=======================");
    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 1;
        int index = 0;

        while(true) {
            if(k == count) {
                answer = numbers[index % numbers.length];
                break;
            }
            index += 2;
            count++;
        }

        return answer;
    }
}