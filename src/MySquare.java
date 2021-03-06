/**
 * Takes 1 double argument from stdin and outputs 
 * to stdout the square of the argument multiplied by 4.0.
 */
public class MySquare {

    public static void main(String[] args) throws NumberFormatException {
    	double result = new MySquare().doMath(Double.parseDouble(args[0]));
        System.out.println( result );
    }

    /**
     * Does math on the parameter base.
     *
     * @param base
     *     The double on which math is performed.
     */
    public double doMath( double base )
    {
    	double result = 4.0*Math.pow(base,2);
    	return result;
    }

}
