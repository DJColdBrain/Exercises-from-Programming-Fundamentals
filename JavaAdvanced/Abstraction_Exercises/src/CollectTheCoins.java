import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = new char[4][];

        for (int i = 0; i < 4; i++) {
            board[i] = scanner.nextLine().toCharArray();
        }
        char[] moves = scanner.nextLine().toCharArray();

        int[] player = new int[2];
        int wallsHit = 0;
        int coinsCollected = 0;
        for (int i = 0; i < moves.length; i++) {
            int nextMoveX = 0;
            int nextMoveY = 0;
            switch (moves[i]){
                case '>':
                    nextMoveX = 1;
                    break;
                case '<':
                    nextMoveX = -1;
                    break;
                case '^':
                    nextMoveY = -1;
                    break;
                case 'V':
                    nextMoveY = 1;
                    break;

            }
            if (Character.toString(board[player[1]][player[0]]).equals("$")){
                coinsCollected++;
            }
            if (player[0] + nextMoveX < 0 || player[0] + nextMoveX >= board[player[1]].length ||
                        player[1] + nextMoveY < 0 || player[1] + nextMoveY >= board.length){
                    wallsHit++;
            }else{
                player[0] += nextMoveX;
                player[1] += nextMoveY;

                if (player[0] > board[player[1]].length){
                    wallsHit++;
                    player[0] -= nextMoveX;
                    player[1] -= nextMoveY;
                }
            }

        }
        System.out.println("Coins = " + coinsCollected);
        System.out.println("Walls = " + wallsHit);

    }
}
