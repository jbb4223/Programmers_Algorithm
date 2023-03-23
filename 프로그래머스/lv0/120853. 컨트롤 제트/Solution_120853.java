public class Solution_120853 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3};
        System.out.println("=======================");
        System.out.println(solution("1 2 Z 3"));
        System.out.println("=======================");
    }

    public static int solution(String s) {
            int answer = 0;
            String [] arr = s.split(" ");

            for(int i=0; i<arr.length; i++) {
                if(arr[i].equals("Z")) {
                    answer -= Integer.parseInt(arr[i-1]);
                } else {
                    answer += Integer.parseInt(arr[i]);
                }
            }


            return answer;
    }
}