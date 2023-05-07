/*
 *  File: MetricConverter.java
 *  Author: Java, Java, Java
 *  Description: This class implements the static milesToKm()
 *    method, which converts miles to kilometers.
 */

package L6;

public class MetricConverter {

    /**
     *  mileToKm() converts miles to kilometers
     *  @param miles -- the number of miles to convert
     *  @return -- a double giving the number of kilometers
     */
    public static double milesToKm(double miles) {
        return miles / 0.62;
    }
    public static double kmToMiles(double km) {
        return km * 0.62;
    }
}
