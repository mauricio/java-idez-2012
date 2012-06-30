package threads;

import java.math.BigInteger;

public class Fatorial {

    public static BigInteger fatorial( BigInteger value ) {
        BigInteger accumulated = BigInteger.valueOf(1);
        BigInteger current     = BigInteger.valueOf(2);
        while ( current.compareTo(value) <= 0 ) {
            accumulated = accumulated.multiply( current );
            current = current.add( BigInteger.valueOf(1) );
        }

        return accumulated;
    }
	
}
