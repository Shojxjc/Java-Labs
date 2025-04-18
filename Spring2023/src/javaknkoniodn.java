public static int[][] copy(int[][] arr, int i) {
    int[][] copy = new int[i+1][arr[0].length];
    for (int j = 0; j <= i; j++) {
        for (int k = 0; k < arr[0].length; k++) {
            copy[j][k] = arr[j][k];
        }
    }
    return copy;
}



public static int[][] rowcopythingy(int y, int[][]x){
	int[][] result = new int[y+1][x[0].length];
	for (int i = 0; i <= y; i++){
		for (int j = 0; j < x[0].length; j++) {
			copy[i][j] = x[i][j];
		}
	}
	return result;
}
