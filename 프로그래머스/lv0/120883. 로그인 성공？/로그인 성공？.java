import java.util.Arrays;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
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