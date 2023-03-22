public class Solution_120864 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("=======================");
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println("=======================");
    }

    public static int solution(String my_string) {
        int answer = 0;
        String [] arr = my_string.split("[a-zA-z]+");

        for(String s : arr) {
            answer += s.equals("") ? 0 : Integer.parseInt(s);
        }

        return answer;
    }
}