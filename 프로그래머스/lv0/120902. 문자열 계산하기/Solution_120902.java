public class Solution_120902 {

    public static void main(String[] args) {
        // 예시
        int [] arr = {1, 2, 3};
        System.out.println("=======================");
        System.out.println(solution("3 + 4 - 10"));
        System.out.println("=======================");
    }

    public static int solution(String my_string) {
            int answer = 0;
            String [] arr = {};
            
            arr = my_string.split(" ");
            answer = Integer.parseInt(arr[0]);

            for(int i=0; i<arr.length; i++) {
                if(arr[i].equals("+")) {
                    answer += Integer.parseInt(arr[i+1]);
                } else if (arr[i].equals("-")) {
                    answer -= Integer.parseInt(arr[i+1]);
                }
            }

            return answer;
    }
}