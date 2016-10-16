import java.awt.print.Printable;

/**
 * Examples for SDG Java lessons
 * 
 * @author Yip Tsz To
 */

@SuppressWarnings("unused")
public class Examples {

	public static void main(String[] args) {
	}

	static void example01() {
		char c = 'a'; // single character
		String s = "qwertyASDF1234!@#$"; // multiple characters
		int i = 123; // integer
		double d = 3.14; // number
		boolean b = true; // true or false
	}

	static void example02a() { // good
		String the_truth = "iOS sucks"; // underscore
		int count = 689;
		boolean isAttendingTraining = true; // Camel case
	}

	static void example02b() { // nonono
		String ?truth = "iOS is the best";
		int 7cunt = 689;
		boolean IsPaYiNgAtTeNtIoN = false;
	}
	
	static void example03() {
		String s = "Hell Word";
		// value of string s is "Hell Word"
		s = "Hello, World!";
		// value of string s is "Hello, World!"
	}
}
