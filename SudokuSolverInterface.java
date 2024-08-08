interface SudokuSolverInterface {
    boolean isSafe(char[][] board, int row, int col, int number);
    boolean helper(char[][] board, int row, int col);
    void solveSudoku(char[][] board);
}
