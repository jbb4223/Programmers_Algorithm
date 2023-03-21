public class Solution_120834 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {4, 455, 6, 4, -1, 45, 6};
        System.out.println("=======================");
        System.out.println(solution(23));
        System.out.println("=======================");
    }

    public static String solution(int age) {
        String answer = "";
        String [] arr = String.valueOf(age).split("");

        for(String s : arr) {
            answer += (char)(Integer.parseInt(s)+ 97);
        }


        return answer;
    }
}