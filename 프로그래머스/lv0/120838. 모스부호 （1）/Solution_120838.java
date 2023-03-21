public class Solution_120838 {

    public static void main(String[] args) {
        // 예시
//        int [] arr = {4, 455, 6, 4, -1, 45, 6};
        System.out.println("=======================");
        System.out.println(solution(".--. -.-- - .... --- -."));
        System.out.println("=======================");
    }

    public static String solution(String letter) {
        String answer = "";
        String [] morse = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };

        String [] arr = letter.split(" ");

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<morse.length; j++) {
                if(arr[i].equals(morse[j])) {
                    arr[i] = String.valueOf((char) (j + 97));
                }
            }
        }

        answer = String.join("", arr);


        return answer;
    }
}