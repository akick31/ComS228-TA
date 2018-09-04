package Recitation1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * An example to use to play with the debugger and demonstrate command-line
 * arguments. Some points: - The "String[] args" parameter to main contains the
 * arguments, and will never be null if that is where execution begins. - Plain
 * breakpoints will cause execution to stop every time at that point. -
 * Conditional breakpoints can be used in recursive and iterative cases to save
 * you time. - Exception breakpoints can be helpful in examining the situations
 * that cause them. - Different stack frames can be selected, and their local
 * variables inspected. - Objects can be expanded to examine their internal
 * state.
 *
 * @author Mike Petersen
 */
public class DebuggerExample {
	public static void main(String[] args) {
		int n;
		Random r;

		r = new Random();

		if (1 <= args.length) {
			try {
				n = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.printf("Couldn't parse \"%s\" as a number\n", args[0]);

				System.exit(1);
				return;
			}
		} else {
			n = r.nextInt(181) - 90;
		}

		// to test breakpoints, stack
		long value = fibo(n);

		System.out.printf("Fibonacci number %3d is %d\n", n, value);

		// to examine internal state of objects
		// (Eclipse debugger has "logical" view as well)
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 12; ++i) {
			list.add(r.nextInt(144));
		}

		System.out.println("A random list is " + list);
	}

	/**
	 * Calculates the n-th Fibonacci number. Negative values are permitted.
	 *
	 * @param n
	 *            the index of the Fibonacci number to calculate
	 * @return the n-th Fibonacci number
	 */
	public static long fibo(int n) {
		// remove this if block to cause StackOverflowError on negative inputs
		if (0 > n) {
			if (0 == n % 2) {
				return fibo(-n);
			} else {
				return -fibo(-n);
			}
		} else {
			return fiboHelperRec(n, 0, 1);
			// return fiboHelperItr(n, 0, 1);
		}
	}

	/**
	 * Calculates the n-th number encountered using a Fibonacci adding pattern,
	 * starting with the values a and b.
	 *
	 * @param n
	 *            how many more iterations should be performed; must be non-negative
	 * @param a
	 *            the second-to-last number
	 * @param b
	 *            the last number
	 * @return the n-th number after the values of a and b
	 */
	private static long fiboHelperRec(int n, long a, long b) {
		if (0 == n) {
			return a;
		} else if (1 == n) {
			return b;
		} else {
			return fiboHelperRec(n - 1, b, a + b);
		}
	}

	/**
	 * Calculates the n-th number encountered using a Fibonacci adding pattern,
	 * starting with the values a and b.
	 *
	 * @param n
	 *            how many more iterations should be performed; must be non-negative
	 * @param a
	 *            the second-to-last number
	 * @param b
	 *            the last number
	 * @return the n-th number after the values of a and b
	 */
	private static long fiboHelperItr(int n, long a, long b) {
		long tmp;

		while (0 < n) {
			tmp = a + b;

			--n;
			a = b;
			b = tmp;
		}

		return a;
	}
}
