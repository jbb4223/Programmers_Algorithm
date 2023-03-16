public class Solution_120892 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("pfqallllabwaoclk",2));
        System.out.println("=======================");
    }

    public static String solution(String cipher, int code) {
        String answer = "";
        char [] charArr = cipher.toCharArray();

        for(int i=code-1; i<charArr.length; i = i+code) {
            answer += charArr[i];
        }

        return answer;
    }
}