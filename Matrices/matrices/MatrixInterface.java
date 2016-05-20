package matrices;

public interface MatrixInterface{
	
	public boolean isSquareMatrix();
	public Matrix transpose();
	public double evaluateTrace();
	public Matrix add(Matrix matrix);
	
}