import java.util.Arrays;

public class Solution_120883 {

    public static void main(String[] args) {
        // 예시
        String [] arr = {"meosseugi", "1234"};
        String [][] arr2 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
//            int [] arr2 = {5, 5};
        System.out.println("=======================");
        System.out.println(solution(arr, arr2));
        System.out.println("=======================");
    }

    public static String solution(String[] id_pw, String[][] db) {
            String answer = "";

            for(String [] sArr : db) {
                // 아이디 및 비밀번호 일치할때 (로그인성공)
                if(Arrays.equals(id_pw, sArr)) {
                    answer = "login";
                    break;
                }
                // 아이디 혹은 비밀번호 일치하지 않을때 (로그인실패)
                else {
                    // 아이디만 일치하면
                    if(id_pw[0].equals(sArr[0])) {
                        answer = "wrong pw";
                        break;
                    } else {
                        answer ="fail";
                    }
                }
            }

            return answer;
    }
}