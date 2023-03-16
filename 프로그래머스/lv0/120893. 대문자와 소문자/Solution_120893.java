public class Solution_120893 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("cccCCC"));
        System.out.println("=======================");
    }

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char [] charArr = my_string.toCharArray();

        for(char c : charArr) {
            if(Character.isUpperCase(c)) {
                answer.append(String.valueOf(c).toLowerCase());
            } else {
                answer.append(String.valueOf(c).toUpperCase());
            }
        }

        return answer.toString();
    }
}