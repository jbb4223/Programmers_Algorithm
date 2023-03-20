public class Solution_120895 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("I love you", 3, 6));
        System.out.println("=======================");
    }

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        char [] arr = my_string.toCharArray();
        char temp;

        temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        answer = String.valueOf(arr);

        return answer;
    }
}