import java.util.Arrays;

public class Rotate {

	public static int[][] rotateMatrix(int[][] m, int n) {
		for (int i=0; i<n/2; i++) {
			int first = i;
			int last = n-1-i;

			for (int j=first; j<last; j++) {
				int decrement = j-first;
				int holder = m[first][j];
				m[first][j] = m[last-decrement][first];
				m[last-decrement][first] = m[last][last-decrement];
				m[last][last-decrement] = m[j][last];
				m[j][last] = holder;
			}
		}
		return m;
	}

	public static void main(String[] args) {
		int [][] sudoku = new int[][] {
      		{ 0, 8, 0, 1, 5 },
		{ 0, 8, 0, 2, 4 },
		{ 0, 8, 0, 3, 3 },
      		{ 0, 3, 4, 4, 2 },
      		{ 9, 6, 0, 5, 1 },
    		};
		System.out.println(Arrays.deepToString(rotateMatrix(sudoku,5)));
	}
} 
