public class ArrayTest {
	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{0, 1},
			{2, 3}
			};
			
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}