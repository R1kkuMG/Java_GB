package Queens;

public class Queens {
    int[][] board = new int [8][8];
    int size = board.length;
    int n = 8; // кол-во ферзей

    boolean tryQueen (int row, int col) {
        // поиск ферзя(1) в строке
        for (int i = 0; i < size; i++)
            if (board[row][i] == 1)
                return false;

        // поиск ферзя(1) в столбце
        for (int i = 0; i < size; i++)
            if (board[i][col] == 1)
                return false;

        // диагональ вниз-вправо
        for (int i = row, j = col; i < size && j < size; i++, j++)
            if (board[i][j] == 1)
                return false;

        // диагональ вниз-влево
        for (int i = row, j = col; i < size && j >= 0; i++, j--)
            if (board[i][j] == 1)
                return false;

        // диагональ вверх-вправо
        for (int i = row, j = col; i >= 0 && j < size; i--, j++)
            if (board[i][j] == 1)
                return false;

        // диагональ вверх-влево
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    boolean setQueen(int col) {
        if (col >= n)
            return true;
        for (int i = 0; i < n; i++) {
            if (tryQueen(i, col)) {
                board[i][col] = 1;
                if (setQueen(col + 1) == true)
                    return true;
                board[i][col] = 0;
            }
        }
        return false;
    }

    boolean setNewQueen()
    {
        if (setQueen(0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }
        setBoard(board);
        return true;
    }

    // рисует шахматную доску
    void setBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
