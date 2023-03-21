class Solution {
    public String solution(String letter) {
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