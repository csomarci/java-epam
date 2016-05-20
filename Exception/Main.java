
class ZeroParameterException extends RuntimeException {
    public ZeroParameterException() {
        super();
    }

    public ZeroParameterException(final String msg) {
        super(msg);
    }
}

public class Main { 
    public static double divide(int a, int b) {
        if (0 == b) {
            throw new ZeroParameterException("b cannot be zero!");
        }

        return (double) a / b;
    }

    public static void main(String[] args) {
        //try {
        //    double res = divide(4, 0);
        //} catch (ZeroParameterException e) {
        //    System.err.println(e.getMessage());
        //} catch (Exception e) {
        //    System.err.println(e.getMessage());
        //} finally {
        //    System.err.println("finally - over!");
        //}
		
		double res = divide(4, 0);
    }
}