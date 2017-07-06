/**
 * Takes 1 double argument from stdin and outputs 
 * to stdout the square of the argument.
 */
public class MySquare {

    public static void main(String[] args) throws NumberFormatException {
    	double base = Double.parseDouble(args[0]);
    	System.out.println( Math.pow(base,2) );
    }

}
