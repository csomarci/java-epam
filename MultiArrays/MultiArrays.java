public class MultiArrays {

	public static void main(String[] args){
		double[][] arr = new double[3][3];
		int[][] intArr = {{0,1,2},{1,2,3},{2,5,4}};
		arr[1][1] = 1;
		System.out.println( asMatrix( arr ) );
		System.out.println( asMatrixWithSum( intArr ) );
	}
	
	public static String asMatrix (double[][] array){
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				str.append(array[i][j]);
				if (j != array.length - 1){
					str.append(" ");
				} else {
					str.append("\n");
				}
			}
		}
		return str.toString();
	}
	
		public static String asMatrixWithSum (int[][] array){
		StringBuilder str = new StringBuilder();
		int diagSum = 0;
		int[] colSum = new int[array.length];
		for (int i = 0; i < array.length; i++){
			int rowSum = 0;
			for (int j = 0; j < array[i].length; j++){
				colSum[j] += array[i][j];
				if (j == i){
					diagSum += array[i][j];
				}
				str.append(array[i][j]);
				rowSum += array[i][j];
				if (j != array.length - 1){
					str.append(" ");
				} else {
					str.append(" | " + rowSum + "\n");
				}
			}
		}
		for (int j = 0; j < array.length; j++){
			if (j != array.length - 1){
				str.append("--");
			} else {
				str.append("--/\n");
			}
		}
		for (int j = 0; j < array.length; j++){
			str.append(colSum[j]);
			if (j != array.length - 1){
				str.append(" ");
			} else {
				str.append("   " + diagSum);
			}
		}
		return str.toString();
	}
}