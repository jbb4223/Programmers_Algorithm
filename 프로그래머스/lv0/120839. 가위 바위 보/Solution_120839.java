public class Solution_120839 {

    public static void main(String[] args) {
        // 예시
        System.out.println("=======================");
        System.out.println(solution("205"));
        System.out.println("=======================");
    }


    public static String solution(String rsp) {
        String answer = "";

        for(int i=0; i<rsp.length(); i++) {
            if(rsp.charAt(i) == '2') {
                answer += "0";
            } else if(rsp.charAt(i) == '0') {
                answer += "5";
            } else if (rsp.charAt(i) == '5') {
                answer += "2";
            }
        }

        return answer;
    }
}