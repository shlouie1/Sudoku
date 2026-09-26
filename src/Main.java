import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;

public class Main {

	static boolean solvingAlgorithm(int[][] boardArray) {
		final int SUM_COLUMNROW_CHECK = 405;
		final int SUM_BOX_CHECK = 45;

		int rowCheck = 0;
		int columnCheck = 0;
		int boxCheck = 0;

		boolean algStatus = true;
			
		

		//row check
		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				rowCheck = Arrays.stream(boardArray[row]).sum();
				algStatus = (rowCheck == SUM_COLUMNROW_CHECK) ? true : false;
			}
		}

		//column check
		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				columnCheck += boardArray[column][row];
				algStatus = (columnCheck == SUM_COLUMNROW_CHECK) ? true : false;
			}
		}

		//box check
		for (int i = 1; i < 10; i++) {
			for (int boxRow = 0; (boxRow) < (3); boxRow++) {
				for (int boxColumn = 0; (boxColumn) < (3) ; boxColumn++) {
					boxCheck += boardArray[boxRow][boxColumn];
					
				}
			}
		}

		if (algStatus == true)
			return true;
		else
			return false;
	}

	public static void main (String[] args) {
		int[][] boardArray = {
							    {5, 3, 4, 6, 7, 8, 9, 1, 2},
							    {6, 7, 2, 1, 9, 5, 3, 4, 8},
							    {1, 9, 8, 3, 4, 2, 5, 6, 7},
							    {8, 5, 9, 7, 6, 1, 4, 2, 3},
							    {4, 2, 6, 8, 5, 3, 7, 9, 1},
							    {7, 1, 3, 9, 2, 4, 8, 5, 6},
							    {9, 6, 1, 5, 3, 7, 2, 8, 4},
							    {2, 8, 7, 4, 1, 9, 6, 3, 5},
							    {3, 4, 5, 2, 8, 6, 1, 7, 9}
							};
		System.out.println(solvingAlgorithm(boardArray));
	}
}	