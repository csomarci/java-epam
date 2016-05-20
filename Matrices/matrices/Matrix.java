package matrices;

public class Matrix implements MatrixInterface{

	private double[][] elements;

	public double[][] getElements(){
		return this.elements;
	}
	
	public double getElementAt(int n, int m){
		return this.elements[n][m];
	}
	
	public void setElements(double[][] elements){
		this.elements = elements;
	}
	
	public void setElementAt(double element,int n, int m){
		this.elements[n][m] = element;
	}
	
	public Matrix(int n,int m){
		elements = new double[n][m];
		for (int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < m ; j++) {
				elements[i][j] = 1.0;
			}
		}
	}
	
	public Matrix(double[][] arg){
		elements = arg;
	}
	
	@Override
	public boolean isSquareMatrix(){
		if (elements.length == elements[0].length) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean equals(Object o) {
		if ((o instanceof Matrix) && (elements.length == ((Matrix)o).getElements().length) && (elements[0].length == ((Matrix)o).getElements()[0].length)) {
            for (int i = 0; i < elements.length; i++) {
				for (int j = 0 ; j < elements.length; j++) {
					if (elements[i][j] != ((Matrix)o).getElementAt(i,j)) {
						return false;
					}
				}
			}
			return true;
        } else {
            return false;
        }
	}
	
	@Override
    public int hashCode() {
        return elements.hashCode();
    }
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements[i].length; j++) {
				str.append(elements[i][j]);
				if (j != elements[i].length - 1){
					str.append(" ");
				} else {
					str.append("\n");
				}
			}
		}
		return str.toString();
	}
	
	@Override
	public Matrix transpose(){
		Matrix result = new Matrix(elements[0].length,elements.length);
		for (int i = 0; i < elements[0].length; i++) {
			for (int j = 0; j < elements.length; j++) {
				result.setElementAt(elements[j][i],i,j);
			}
		}
		return result;
	}
	
	@Override
	public double evaluateTrace(){
		double result = 0.0;
		if (!this.isSquareMatrix()){
			result = Double.NaN;
		} else {
			for (int i = 0; i < elements.length; i++) {
				result += elements[i][i];
			}
		}
		return result;
	}
	
	@Override
	public Matrix add(Matrix matrix){
		if (elements.length != matrix.getElements().length || elements[0].length != matrix.getElements()[0].length){
			return null;
		} else {
			Matrix result = new Matrix(elements.length, elements[0].length);
			for (int i = 0; i < elements.length; i++){
				for (int j = 0; j < elements[i].length; j++){
					double addition = elements[i][j] + matrix.getElementAt(i,j);
					result.setElementAt(addition,i,j);
				}
			}
			return result;
		}
	}
	
}