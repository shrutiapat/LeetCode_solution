class Solution {
   public int[][] transpose(int[][] A) {
	//dimensions
	int M = A.length; int N = A[0].length;

	//result matrix (w/ size from transposition)
	int[][] B = new int[N][M];

	//iterate thru A
	for (int i = 0; i < M; i++) {
		for (int j = 0; j < N; j++) {
			//transpose
			B[j][i] = A[i][j];
		}
	}

	return B;
}
}