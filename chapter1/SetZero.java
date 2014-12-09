import java.util.Arrays;

public class SetZero {

	public static int[][] setZeros(int[][] matrix) {
		boolean[] rows = new boolean[matrix.length];
		boolean[] cols = new boolean[matrix[0].length];
		
		for (int i=0; i<matrix.length; i++) {
			for (int j=0; j<matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}
			
		for (int i=0; i<matrix.length; i++) {
			if (rows[i] == true)
				nullifyRows(matrix, i);
		}

		for (int j=0; j<matrix[0].length; j++) {
			if (cols[j] == true)
				nullifyCols(matrix, j);
		}
	return matrix;
	}

	public static void nullifyRows(int[][] m, int r) {
		for (int i=0; i<m[0].length; i++) {
			m[r][i] = 0;
		}
	}

	public static void nullifyCols(int[][] m, int c) {
		for (int i=0; i<m.length; i++) {
			m[i][c] = 0;
		}
	}

	public static void main(String[] args) {
		int[][] sudoku = new int[][] {
      		{ 1, 8, 5, 1, 5 },
		{ 1, 8, 0, 2, 4 },
		{ 1, 8, 0, 3, 3 },
      		{ 1, 0, 4, 4, 2 },
      		{ 9, 6, 0, 5, 1 },
    		};
	System.out.println(Arrays.deepToString(setZeros(sudoku)));
	}
}
		
		
