import matrices.*;

public class Main{
	
	public static void main(String[] args){
		Matrix mat = new Matrix(3,3);
		Matrix mat2 = new Matrix(3,4);
		Matrix mat3 = mat2.transpose();
		Matrix mat4 = mat.add(mat);
		System.out.println("Matrix 1 :\n");
		System.out.println(mat.toString());
		
		System.out.println("Matrix 2 :\n");
		System.out.println(mat2.toString());
		
		System.out.println("Matrix 3 (Matrix 2 transpose):\n");
		System.out.println(mat3.toString());
		
		System.out.println("Matrix 4 (Matrix 1 + Matrix 1) :\n");
		System.out.println(mat4.toString());
		
		System.out.println("Matrix 1 is square: " + mat.isSquareMatrix());
		System.out.println("Matrix 2 is square: " + mat2.isSquareMatrix());
		System.out.println("Matrix 2 is equal to Matrix 1: " + mat2.equals(mat));
		System.out.println("Matrix 2 is equal to Matrix 2: " + mat2.equals(mat2));
		
		System.out.println("Matrix 1 trace: " + mat.evaluateTrace());
		System.out.println("Matrix 2 trace: " + mat2.evaluateTrace());
		
	}
}