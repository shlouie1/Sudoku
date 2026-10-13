import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
				int[][] board = {
		    {5, 3, 0, 0, 7, 0, 0, 0, 0},
		    {6, 0, 0, 1, 9, 5, 0, 0, 0},
		    {0, 9, 8, 0, 0, 0, 0, 6, 0},
		    {8, 0, 0, 0, 6, 0, 0, 0, 3},
		    {4, 0, 0, 8, 0, 3, 0, 0, 1},
		    {7, 0, 0, 0, 2, 0, 0, 0, 6},
		    {0, 6, 0, 0, 0, 0, 2, 8, 0},
		    {0, 0, 0, 4, 1, 9, 0, 0, 5},
		    {0, 0, 0, 0, 8, 0, 0, 7, 9}
		};
		boardSolved(board);
		System.out.println(Arrays.deepToString(board));
	}

	public static boolean isNumberInBox(int board[][], int number, int row, int col) {

		int localRowBox = row - (row % 3);
		int localColBox = col - (col % 3);

		for (int rowX = localRowBox; rowX < (localRowBox + 3); rowX++) {
			for (int colX = localColBox; colX < (localColBox + 3); colX++) {
				if (board[rowX][colX] == number) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isNumberInRow(int board[][], int number, int row) {
		for (int colIterable = 0; colIterable < 9; colIterable++) {
			if (board[row][colIterable] == number) {
				return true;
			}
		}
		return false;
	}

	public static boolean isNumberInCol(int board[][], int number, int col) {
		for (int rowIterable = 0; rowIterable < 9; rowIterable++) {
			if (board[rowIterable][col] == number) {
				return true;
			}
		}
		return false;
	}

	public static boolean doesNumberWork (int[][] board, int number, int row, int col) {
		return (! (isNumberInRow(board, number, row) || isNumberInCol(board, number, col) || isNumberInBox(board, number, row, col))); 
	}

	public static boolean boardSolved(int board[][]) {
		
	}











}