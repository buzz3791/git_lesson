/**
 * Takes 1 double argument from stdin and outputs 
 * to stdout the square of the argument multiplied by 4.0.
 *
 */
public class MySquare {

    public static void main(String[] args) throws NumberFormatException {
    	double y = Double.parseDouble(args[0]);
    	System.out.println( 4.0*Math.pow(y,2) );
    }

}
