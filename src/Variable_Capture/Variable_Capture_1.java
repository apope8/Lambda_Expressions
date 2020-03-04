package Variable_Capture;

import Functional_Interfaces.MyInterface;

public class Variable_Capture_1 {

	static String thirdText = "Hey, a third text";

	public static void main(String[] args) {

		String otherText = "Hello: ";

		MyInterface myInterface = (text) -> {
			System.out.println(otherText + text + " " + thirdText);
		};

		thirdText = "Bla Bla Bla";

		myInterface.printIt("ABC");
	}

}
