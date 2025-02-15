/* Lab Exercises No.4
 * Accelerated Introduction to Computer Science Fall 2023
 * Course CS 201 02
 * Professor: Md Ali
 * Students: Andres Orozco, Jisun Yun, Harlee Ramos
 */

import java.text.*;

//It was necessary to use the library java.util.Locale for using the US dollar format
import java.util.Locale;

public class SubwayMath {
    // Global instance variables declaration
    private double bonus, ride;

    // Global class default constants
    private static final double DEFAULT_BONUS = .15, DEFAULT_RIDE = 2.0;

    //It was modified from the original code: NumberFormat.getCurrencyInstance (Locale.US); the parameter to Locale.US
    private static final NumberFormat DOLLAR_FORMAT = NumberFormat.getCurrencyInstance ( Locale.US);
    private static final DecimalFormat PERCENT_FORMAT = new DecimalFormat ( "##0.0%" );


    /* Default Constructor SubwayMath()
     *Sets or initializes the bonus to it default value "0.15" (15%)
     *Sets or initializes the ride cost to it default value "2.0" ($2.00) */
    public SubwayMath ( ) {
        setBonus ( DEFAULT_BONUS ); // good practice to call "sets" here
        setRideCost ( DEFAULT_RIDE );
    }

    /* Overloaded constructor SubwayMath()
     * @param newBonus   new value for bonus
     * @param newRide    new value for ride
     * Sets or initializes the bonus to its new value
     * Sets or initializes the ride cost to its new value*/

    public SubwayMath ( double newBonus, double newRide ) {
        setBonus ( newBonus );  // good practice to call "sets" here
        setRideCost ( newRide );
    }

    //Accessor method getBonus()
    public double getBonus ( ) {
        return bonus;
    }

    public double getRideCost ( ) {
        return ride;
    }

    //mutator methods
    public void setBonus ( double newBonus ) {
        bonus = newBonus; // you do NOT need to do any data validation, the input interface on the vending machine does this
    }

    public void setRideCost ( double newRide ) {
        ride = newRide; // you do NOT need to do any data validation, the input interface on the vending machine does this
    }

    public String toString ( ) {
        return "Bonus: " + PERCENT_FORMAT.format ( bonus ) +
                " Ride Cost: " + DOLLAR_FORMAT.format ( ride );
    }

    public double optimalAmount ( int count ) {
        return Math.ceil ( ( ( count * ride ) / ( 1 + bonus ) ) * 100.0 ) / 100.0;
    }

    public String optimalAmount ( int count1, int count2 ) {
        double amt1 = Math.ceil ( ( ( count1 * ride ) / ( 1 + bonus ) ) * 100.0 ) / 100.0;
        double amt2 = Math.ceil ( ( ( count2 * ride ) / ( 1 + bonus ) ) * 100.0 ) / 100.0;
        return DOLLAR_FORMAT.format ( amt1 ) + "," + DOLLAR_FORMAT.format ( amt2 );
    }
}

