public class Solution_120854 {

    public static void main(String[] args) {
        // 예시
        String[] arr = {"dkdkdk"};
        System.out.println("=======================");
        System.out.println(solution(arr));
        System.out.println("=======================");
    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i=0; i<strlist.length; i++){
            answer[i] = strlist[i].length();
        }        
        return answer;
    }
}