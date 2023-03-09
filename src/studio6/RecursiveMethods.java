package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		double sum = 0;
		// FIXME compute the geometric sum for the first n terms recursively
		if (n == 0) {
			return 0;
		}
		sum = Math.pow(0.5, n);
		return sum + geometricSum(n - 1);

	}

	/**
	 * This method uses recursion to compute the greatest common divisor for the two
	 * input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		}

		int temp = q;
		q = p % q;
		p = temp;
		return gcd(p, q);

	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {

		// FIXME create a helper method that can recursively reverse the given arr
		int[] reversed = new int[array.length];
		reversed = array.clone();
		if (array.length == 0) {

			return reversed;
		}
		
	return toReversedHelper(reversed, 0);
		


	}

	public static int[] toReversedHelper(int[] array, int index) {
		if (index >= array.length / 2) {
			return array;
		}
		int p = array[index];
		int q = array[array.length - 1 - index];
		array[index] = q;
		array[array.length - 1 - index] = p;
		return toReversedHelper(array, index + 1);
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		if (radius <= radiusMinimumDrawingThreshold) {
			StdDraw.circle(xCenter, yCenter, radiusMinimumDrawingThreshold);
			}
		
		StdDraw.circle(xCenter, yCenter, radius);
		circlesUponCircles(xCenter,yCenter,radius,(radiusMinimumDrawingThreshold/3.0));
		
		
	}

}
