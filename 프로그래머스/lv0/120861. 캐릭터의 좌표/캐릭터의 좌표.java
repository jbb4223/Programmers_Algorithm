class Solution {
    public int[] solution(String[] keyinput, int[] board) {
            int[] position = {0, 0};

            for(String s : keyinput) {

                switch (s) {
                    case "left":
                        position[0]--;
                        break;
                    case "right":
                        position[0]++;
                        break;
                    case "up":
                        position[1]++;
                        break;
                    case "down":
                        position[1]--;
                        break;
                }

                if(Math.abs(position[0]) > (board[0] / 2)) {
                    position[0] = position[0] < 0 ? -(board[0] / 2) : (board[0] / 2);
                }

                if(Math.abs(position[1]) > (board[1] / 2)) {
                    position[1] = position[1] < 0 ? -(board[1] / 2) : (board[1] / 2);
                }
            }

            return position;
    }
}