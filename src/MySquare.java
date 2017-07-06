/**
 * Takes 1 double argument from stdin and outputs 
 * to stdout the square of the argument multiplied by 2.0.
 *
 */
public class MySquare {

    public static void main(String[] args) throws NumberFormatException {
    	double z = Double.parseDouble(args[0]);
    	System.out.println( 6.0 * z * z );
    }

}
