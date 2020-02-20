public class Maze {

    int[][] startPosition = {{0, 1}};

    int[][] hBoard =
                    {{1, 0, 1, 1, 1, 1},
                    {0, 1, 1, 0, 0, 0},
                    {1, 0, 0, 1, 0, 0},
                    {0, 0, 1, 0, 1, 0},
                    {1, 1, 1, 1, 0, 1},
                    {1, 1, 0, 1, 1, 1}};
    int[][] vBoard =
                    {{1, 1, 1, 1, 1},
                    {0, 0, 1, 0, 0},
                    {0, 1, 1, 1, 0},
                    {0, 0, 0, 0, 0},
                    {1, 1, 0, 1, 0},
                    {0, 1, 1, 0, 0},
                    {1, 1, 1, 1, 1}};


    public void printBoard() {


        drawHorizontal(hBoard);

    }

    private void printVertical(int[][] hBoard) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (hBoard[i][j] == 1) {


                }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private void printHorizontal() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                // System.out.print(hBoard[i][j]);
                if (vBoard[i][j] == 1) {

                }


    }
}
