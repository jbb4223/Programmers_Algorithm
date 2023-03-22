public class Solution_120887 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {3, 10, 28};
        System.out.println("=======================");
        System.out.println(solution(1,13,1));
        System.out.println("=======================");
    }

    public static int solution(int i, int j, int k) {
        // 내 풀이
        int answer = 0;
        String s = "";
        String [] arr;

        for(int a = i; a<=j; a++) {
            s += a;
        }

        arr = s.split("");

        for(String an : arr) {
            if(an.equals(String.valueOf(k))) {
                answer += 1;
            }
        }

        return answer;


        // 다른 사람풀이 => 이게 더 깔끔한거 같다
//        String str = "";
//        for(int a = i; a <= j; a++) {
//            str += a+"";
//        }
//
//        return str.length() - str.replace(k+"", "").length();
    }
}