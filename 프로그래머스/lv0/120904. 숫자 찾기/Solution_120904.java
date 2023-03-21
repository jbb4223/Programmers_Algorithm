public class Solution_120904 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {4, 455, 6, 4, -1, 45, 6};
        System.out.println("=======================");
        System.out.println(solution(123456, 7));
        System.out.println("=======================");
    }

    public static int solution(int num, int k) {
        int answer = 0;
        String [] arr = String.valueOf(num).split("");

        for(int i=0; i<arr.length; i++) {
            if(Integer.parseInt(arr[i]) == k) {
                answer = i+1;
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}