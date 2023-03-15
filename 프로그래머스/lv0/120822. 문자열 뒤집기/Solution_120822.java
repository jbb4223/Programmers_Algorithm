public class Solution_120822 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("good"));
        System.out.println("=======================");
    }

    public static String solution(String my_string) {
        String answer = "";
        char [] arr = my_string.toCharArray();

        for(int i=arr.length-1; i>=0; i--) {
            answer += arr[i];
        }

        return answer;
    }
}