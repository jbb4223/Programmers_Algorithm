public class Solution120891 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {4, 455, 6, 4, -1, 45, 6};
        System.out.println("=======================");
        System.out.println(solution(29423));
        System.out.println("=======================");
    }

    public static int solution(int order) {
        int answer = 0;
        String [] arr = String.valueOf(order).split("");

        for(String s : arr) {
            if(s.equals("3") || s.equals("6") || s.equals("9")) {
                answer += 1;
            }
        }


        return answer;
    }
}