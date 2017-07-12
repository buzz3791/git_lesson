/**
 * Takes 1 double argument from stdin and outputs 
 * to stdout the cube of the argument.
 */
public class MyCube {

    public static void main(String[] args) throws NumberFormatException {
    	double result = new MyCube().doCube(Double.parseDouble(args[0]));
        System.out.println( result );
    }

    public double doCube( double base )
    {
    	double result = Math.pow(base,3);
    	return result;
    }

}
