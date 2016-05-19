public class ArrayFunctions {

	public static void main(String[] args){
		int[] arr = {1, 2, 4};
		System.out.println(sum(arr));
		System.out.println(avg(arr));
		double[] norm = norm(arr);
		for (double element : norm){
			System.out.print(element + " ");
		}
		System.out.print("\n");
		System.out.println(join(arr));
		System.out.println(join(arr, ';'));
	}
	
	public static int sum (int[] array){
		int sum = 0;
		for (int element : array){
			sum += element;
		}
		return sum;
	}
	
	public static double avg (int[] array){
		return (double)sum(array)/(double)array.length;
	}
	
	public static double[] norm (int[] array){
		int sum = sum(array);
		double[] result = new double[array.length];
		for (int i = 0; i < array.length; i++){
			result[i] = (double)array[i] / (double)sum;
		}
		return result;
	}
	
	public static String join (int[] array){
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < array.length; i++){
			str.append(array[i]);
			if (i != array.length - 1){
				str.append(",");
			}
		}
		return str.toString();
	}
	
	public static String join (int[] array, char separator){
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < array.length; i++){
			str.append(array[i]);
			if (i != array.length - 1){
				str.append(separator);
			}
		}
		return str.toString();
	}
}