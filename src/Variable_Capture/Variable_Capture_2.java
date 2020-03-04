package Variable_Capture;

import Functional_Interfaces.MyInterface;

public class Variable_Capture_2 {

	static String thirdText = "Hey, a third text";
	static String fourthText = "fourth text";

	public void doit(){
		final String otherText = "Hello: ";

		MyInterface myInterface = (text) -> {
			System.out.println(otherText + text + " " + thirdText + " "  + fourthText);
		};

		thirdText = "Bla Bla Bla";

		myInterface.printIt("ABC");
	}

	public static void main(String[] args) {

		Variable_Capture_2 instance = new Variable_Capture_2();
		instance.doit();

	}

}
